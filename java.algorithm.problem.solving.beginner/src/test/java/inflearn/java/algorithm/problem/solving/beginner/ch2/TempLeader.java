package inflearn.java.algorithm.problem.solving.beginner.ch2;

import java.util.Arrays;

/**
 * 11. 임시 반장 정하기
 */
public class TempLeader {

  static int solution(int n, int[][] arr) {
    int[][] copy = new int[n][5];
    int answer = 0;
    int max = Integer.MIN_VALUE;

    for(int i=0;i<n;i++){
      int cnt = 0;
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
    int n = 5;
    int[][] arr = {
        {9, 8, 7, 6, 5},
        {5, 6, 7, 8, 9},
        {1, 2, 3, 7, 8},
        {4, 5, 3, 4, 2},
        {6, 2, 8, 4, 2}
    };

    System.out.println(solution(n, arr));
  }
}
