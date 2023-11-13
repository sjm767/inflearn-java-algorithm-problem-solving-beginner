package inflearn.java.algorithm.problem.solving.beginner.ch2;

import java.util.ArrayList;
import java.util.List;

/**
 * 2. 큰 수 출력하기
 */
public class BigNumber {

  static void solution(int n, int[] arr) {
    List<Integer> list = new ArrayList<>();

    list.add(arr[0]);

    for(int i=1;i<n;i++){
      if(arr[i-1] < arr[i]){
        list.add(arr[i]);
      }
    }

    for (Integer nn : list) {
      System.out.print(nn + " ");
    }

  }

  public static void main(String[] args) {
    int n = 6;
    int []arr = {7,3,9,5,6,12};

    solution(n, arr);
  }
}
