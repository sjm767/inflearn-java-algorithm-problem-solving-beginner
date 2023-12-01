package inflearn.java.algorithm.problem.solving.beginner;

import java.util.*;


public class Main {


  static int[] dy;

  static int solution(int n,int[] arr) {
    int answer = 0;

    dy[0] = 1;
    dy[1] = 1;

    for (int i = 2; i < n; i++) {
      for(int j=0;j<i;j++){
        if(arr[j] < arr[i]){
          dy[i] = Math.max(dy[i], dy[j]+1);
        }
      }
      if(dy[i] == 0){
        dy[i] = 1;
      }
    }

    return Arrays.stream(dy).max().getAsInt();
  }

  public static void main(String[] args) {
    Scanner kb = new Scanner(System.in);
    int n = kb.nextInt();
    int[] arr = new int[n];

    for (int i = 0; i < n; i++) {
      arr[i] = kb.nextInt();
    }

    dy = new int[n];
    System.out.println(solution(n, arr));


  }
}
