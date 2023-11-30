package inflearn.java.algorithm.problem.solving.beginner;

import java.util.*;


public class Main {

  static class Lecture implements Comparable<Lecture>{
    int day;
    int money;

    public Lecture(int day, int money) {
      this.day = day;
      this.money = money;
    }

    @Override
    public int compareTo(Lecture o) {
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
    Scanner kb = new Scanner(System.in);
    int n = kb.nextInt();
    List<Lecture> list = new ArrayList<>();

    for (int i = 0; i < n; i++) {
      int money = kb.nextInt();
      int time = kb.nextInt();

      list.add(new Lecture(time, money));
    }

    System.out.println(solution(n, list));

  }
}
