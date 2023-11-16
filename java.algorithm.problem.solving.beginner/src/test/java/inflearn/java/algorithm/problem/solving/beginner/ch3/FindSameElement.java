package inflearn.java.algorithm.problem.solving.beginner.ch3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 2. 공통 원소 구하기
 */
public class FindSameElement {

  static List<Integer> solution(int n, int[] arr1, int m, int[] arr2) {
    List<Integer> answer = new ArrayList<>();

    Arrays.sort(arr1);
    Arrays.sort(arr2);

    int lt1 = 0;
    int lt2 = 0;

    while (lt1 < n && lt2 < m) {
      if (arr1[lt1] < arr2[lt2]) {
        lt1++;
      } else if (arr1[lt1] > arr2[lt2]) {
        lt2++;
      } else {
        answer.add(arr1[lt1]);
        lt1++;
        lt2++;
      }
    }

    return answer;
  }

  public static void main(String[] args) {
    int n = 5;
    int[] arr1 = {1, 3, 9, 5, 2};
    int m = 5;
    int[] arr2 = {3, 2, 5, 7, 8};

    List<Integer> answer = solution(n, arr1, m, arr2);
    for (int a : answer) {
      System.out.print(a + " ");
    }
  }
}
