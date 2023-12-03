package inflearn.java.algorithm.problem.solving.beginner.ch10;

import java.util.ArrayList;
import java.util.List;

/**
 * 6. 최대 점수 구하기 (냅색 알고리즘)
 */
public class MaxScore {

  static class Problem{
    int score;
    int time;

    public Problem(int score, int time) {
      this.score = score;
      this.time = time;
    }
  }

  static int solution(int n,List<Problem> list, int m) {
    int answer=0;
    int[] dy = new int[m+1];

    for (Problem p : list) {
      int idx = p.time;
      for (int i = m; i >= idx; i--) {
        dy[i] = Math.max(dy[i],dy[i-idx] + p.score);
      }
    }

    return answer;
  }

  public static void main(String[] args) {
    int n = 5;
    int m = 20;

    List<Problem> list = new ArrayList<>();
    list.add(new Problem(10, 5));
    list.add(new Problem(25, 12));
    list.add(new Problem(15, 8));
    list.add(new Problem(6, 3));
    list.add(new Problem(7, 4));

    System.out.println(solution(n, list, m));


  }
}
