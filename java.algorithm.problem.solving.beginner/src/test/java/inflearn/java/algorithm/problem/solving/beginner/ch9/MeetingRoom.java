package inflearn.java.algorithm.problem.solving.beginner.ch9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 2. 회의실 배정
 */
public class MeetingRoom {

  static class Meeting implements  Comparable<Meeting>{
    int s;
    int e;

    public Meeting(int s, int e) {
      this.s = s;
      this.e = e;
    }

    @Override
    public int compareTo(Meeting o) {
      if(this.e == o.e){
        return this.s - o.s;
      }
      return this.e - o.e;
    }
  }

  static int solution(int n, List<Meeting> list){
    int answer = 0;

    Collections.sort(list);

    int s = Integer.MIN_VALUE;
    for (Meeting m : list) {
      if (m.s >= s) {
        answer++;
        s = m.e;
      }

    }

    return answer;
  }

  public static void main(String[] args) {
    int n = 3;
    List<Meeting> list = new ArrayList<>();

    list.add(new Meeting(3, 3));
    list.add(new Meeting(1, 3));
    list.add(new Meeting(2, 3));

    System.out.println(solution(n, list));

  }

}
