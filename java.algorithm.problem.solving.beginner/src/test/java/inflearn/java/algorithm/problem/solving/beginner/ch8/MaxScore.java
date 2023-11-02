package inflearn.java.algorithm.problem.solving.beginner.ch8;

import java.util.ArrayList;
import java.util.List;

/**
 * 3. 최대점수 구하기 (DFS)
 */
public class MaxScore {

  static class Problem{
    public int score;
    public int limit;
    Problem(int score,int limit){
      this.score = score;
      this.limit = limit;
    }
  }

  static int n;
  static int m;
  static int[] arr;

  static List<Problem> list;

  static int answer = 0;

  static void DFS(int L,int sum,int limit){
    if(limit>m){
      return;
    }
    if(L==n){
      answer = Math.max(answer,sum);
    }else{
      DFS(L+1,sum+list.get(L).score,limit+list.get(L).limit);
      DFS(L+1,sum,limit);
    }
  }

  public static void main(String[] args) {
    list = new ArrayList<>();
    n=5;
    m=20;

    list.add(new Problem(10, 5));
    list.add(new Problem(25, 12));
    list.add(new Problem(15, 8));
    list.add(new Problem(6, 3));
    list.add(new Problem(7, 4));

    DFS(0,0,0);

    System.out.println(answer);
  }
}
