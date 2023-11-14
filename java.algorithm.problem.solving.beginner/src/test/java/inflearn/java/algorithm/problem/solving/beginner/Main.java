package inflearn.java.algorithm.problem.solving.beginner;

import java.util.*;

public class Main {

  static int solution(int n, int[][] arr) {
    int answer = 0;
    int horiSum = 0;
    int vertiSum=0;
    int max = Integer.MIN_VALUE;

    for(int i=0;i<n;i++){
      for(int j=0;j<n;j++){
        horiSum+=arr[i][j];
        vertiSum += arr[j][i];
      }

      max = Math.max(horiSum,max);
      max = Math.max(vertiSum, max);

      horiSum=0;
      vertiSum=0;
    }

    horiSum=0;
    vertiSum=0;

    for(int i=0;i<n;i++){
      horiSum+=arr[i][i];
      vertiSum+=arr[i][n-i-1];
    }

    max = Math.max(horiSum,max);
    max = Math.max(vertiSum, max);

    answer = max;
    return answer;
  }

  public static void main(String[] args) {
    Scanner kb = new Scanner(System.in);
    int n =kb.nextInt();
    int [][]arr=new int[n][n];

    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        arr[i][j] = kb.nextInt();
      }
    }

    System.out.println(solution(n, arr));
  }
}
