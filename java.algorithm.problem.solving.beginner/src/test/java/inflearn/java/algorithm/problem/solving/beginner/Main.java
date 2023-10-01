package inflearn.java.algorithm.problem.solving.beginner;

import java.util.*;

public class Main {
  public static int solution(int n, int [][]arr){
    int answer = 0;
    int max = Integer.MIN_VALUE;

    int []sc = new int[n];
    int cnt = 0;

    for(int i=0;i<n;i++){
      cnt = 0;
      for(int j=0;j<n;j++){
        for(int k=0;k<5;k++){
          if(arr[i][k] == arr[j][k]){
            cnt++;
            break;
          }
        }
      }
      if(max < cnt){
        max = cnt;
        answer = i+1;
      }
    }

    return answer;
  }
  public static void main(String[] args) {
    Scanner kb = new Scanner(System.in);

    int n = kb.nextInt();
    int [][]arr = new int[n][5];
    for(int i=0;i<n;i++){
      for(int j=0;j<5;j++){
        arr[i][j] = kb.nextInt();
      }
    }
    System.out.println(solution(n,arr));
  }

}
