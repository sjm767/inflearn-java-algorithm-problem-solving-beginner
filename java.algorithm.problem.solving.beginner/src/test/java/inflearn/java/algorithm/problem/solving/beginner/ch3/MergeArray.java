package inflearn.java.algorithm.problem.solving.beginner.ch3;

/**
 * 1. 두 배열 합치기
 */
public class MergeArray {

  static int[] solution(int n, int[] arr1, int m, int[] arr2) {
    int[] answer = new int[n + m];
    int idx = 0;

    int lt1 = 0;
    int lt2 = 0;

    while (lt1 < n && lt2 < m) {
      if (arr1[lt1] < arr2[lt2]) {
        answer[idx++] = arr1[lt1++];
      } else {
        answer[idx++] = arr2[lt2++];
      }
    }

    while (lt1 < n) {
      answer[idx++] = arr1[lt1++];
    }
    while(lt2 < m){
      answer[idx++] = arr2[lt2++];
    }

    return answer;
  }

  public static void main(String[] args) {
    int n = 3;
    int[] arr1 = {1, 3, 5};
    int m = 5;
    int[] arr2 = {2, 3, 6, 7, 9};

    int[] answer = solution(n, arr1, m, arr2);
    for (int a : answer) {
      System.out.print(a+" ");
    }
  }

}
