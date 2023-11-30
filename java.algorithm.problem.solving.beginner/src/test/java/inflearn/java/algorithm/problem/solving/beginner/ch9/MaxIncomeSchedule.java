package inflearn.java.algorithm.problem.solving.beginner.ch9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * 4. 최대 수입 스케쥴 (PriorityQueue 응용 문제)
 */
public class MaxIncomeSchedule {

  static class Lecture implements Comparable<Lecture>{
    int day;
    int money;

    public Lecture(int day, int money) {
      this.day = day;
      this.money = money;
    }

    @Override
    public int compareTo(Lecture o) {
      if (this.day == o.day) {
        return this.money - o.money;
      }
      return this.day - o.day;
    }
  }

  static int solution(int n, List<Lecture> list) {
    int answer = 0;
    Collections.sort(list,Collections.reverseOrder());
    int maxDay = list.get(0).day;

    Queue<Integer> queue = new PriorityQueue<>(Comparator.reverseOrder());

    int j=0;
    for(int i=maxDay; i>=1;i--){
      for(;j<n;j++){
        if(list.get(j).day < i) {
          break;
        }else{
          queue.offer(list.get(j).money);
        }
      }

      if (!queue.isEmpty()) {
        answer += queue.poll();
      }
    }

    return answer;
  }
  public static void main(String[] args) {
    int n = 6;
    List<Lecture> list = new ArrayList<>();

    list.add(new Lecture(2, 50));
    list.add(new Lecture(1, 20));
    list.add(new Lecture(2, 40));
    list.add(new Lecture(3, 60));
    list.add(new Lecture(3, 30));
    list.add(new Lecture(1, 30));

    System.out.println(solution(n, list));

  }
}
