package inflearn.java.algorithm.problem.solving.beginner.ch10;

import java.util.Arrays;

/**
 * 3. 최대 부분 증가 수열
 */
public class MaxPartialIncreaseSequence {

  static int[] dy;

  static int solution(int n,int[] arr) {
    int answer = 0;

    dy[0] = 1;
    dy[1] = 1;

    for (int i = 2; i < n; i++) {
      int max = 0;
      for(int j=0;j<i;j++){
        if(arr[j] < arr[i] && dy[j] > max){
          max = dy[j];
        }
      }
      dy[i] = max+1;
      answer = Math.max(answer, dy[i]);

    }

    return Arrays.stream(dy).max().getAsInt();
  }

  public static void main(String[] args) {
    int n = 8;
    int[] arr = {5,3,7,8,6,2,9,4};

    dy = new int[n];
    System.out.println(solution(n, arr));


  }

}
