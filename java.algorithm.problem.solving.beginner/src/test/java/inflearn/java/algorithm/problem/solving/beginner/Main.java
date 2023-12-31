package inflearn.java.algorithm.problem.solving.beginner;

import java.util.*;


public class Main {

  static int solution(int n, int[] arr, int m) {
    int answer = 0;
    int[] dy = new int[m+1];

    dy[0] = 0;
    dy[1] = 1;

    for (int i = 2; i <= m; i++) {
      int min= Integer.MAX_VALUE;
      for (int j = 0; j < n; j++) {
        int idx = i-arr[j];
        if(idx >= 0){
          min = Math.min(min, dy[idx] + 1);
        }
      }
      dy[i] = min;
    }

    return dy[m];
  }

  public static void main(String[] args) {
    Scanner kb = new Scanner(System.in);
    int n = kb.nextInt();
    int[] arr = new int[n];

    for (int i = 0; i < n; i++) {
      arr[i] = kb.nextInt();
    }
    int m = kb.nextInt();

    System.out.println(solution(n, arr, m));
  }

}
