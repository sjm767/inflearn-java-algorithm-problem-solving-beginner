package inflearn.java.algorithm.problem.solving.beginner.ch9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 3. 결혼식
 */
public class Wedding {

  static class Time implements Comparable<Time>{
    int time;
    char state;

    public Time(int time, char state) {
      this.time = time;
      this.state = state;
    }

    @Override
    public int compareTo(Time o) {
      if (this.time == o.time) {
        return this.state - o.state;
      }

      return this.time - o.time;
    }
  }

  static int solution(int n,List<Time> list) {
    int answer = 0;
    int cnt = 0;
    Collections.sort(list);

    for (Time t : list) {
      if (t.state == 's') {
        cnt++;
        answer = Math.max(answer, cnt);
      }else{
        cnt--;
      }
    }
    return answer;
  }

  public static void main(String[] args) {
    int n = 10;
    List<Time> list = new ArrayList<>();

    int[] s = {17,6,1,19,4,23,35,26,21,11};
    int[] e = {28,30,27,38,46,30,43,45,31,44};

    for (int i = 0; i < 10; i++) {
      list.add(new Time(s[i], 's'));
      list.add(new Time(e[i], 'e'));
    }

    System.out.println(solution(n, list));
  }
}
