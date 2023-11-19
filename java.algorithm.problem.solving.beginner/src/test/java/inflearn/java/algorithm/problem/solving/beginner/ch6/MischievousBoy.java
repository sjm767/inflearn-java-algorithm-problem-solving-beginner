package inflearn.java.algorithm.problem.solving.beginner.ch6;

import java.util.Arrays;

/**
 * 6. 장난꾸러기
 */
public class MischievousBoy {

  static int[] solution(int n,int[] arr){
    int[] copy = Arrays.copyOf(arr,arr.length);
    int[] answer = new int[2];

    Arrays.sort(copy);

    for (int i=0;i<n;i++) {
      if(copy[i] != arr[i]){
        if(answer[0] == 0){
          answer[0] = i+1;
        }else{
          answer[1] = i+1;
        }
      }
    }

    return answer;
  }

  public static void main(String[] args) {
    int n = 9;
    int[] arr = {120,125,152,130,135,135,143,127,160};
    int[] answer = solution(n, arr);

    for (int a : answer) {
      System.out.print(a+" ");
    }
  }
}
