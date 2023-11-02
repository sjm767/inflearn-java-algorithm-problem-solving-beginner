package inflearn.java.algorithm.problem.solving.beginner;

import java.util.*;

public class Main {

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
    Scanner kb = new Scanner(System.in);
    list = new ArrayList<>();
    n=kb.nextInt();
    m=kb.nextInt();

    for(int i=0;i<n;i++){
      int sc = kb.nextInt();
      int li = kb.nextInt();
      list.add(new Problem(sc, li));
    }

    DFS(0,0,0);

    System.out.println(answer);
  }

}
