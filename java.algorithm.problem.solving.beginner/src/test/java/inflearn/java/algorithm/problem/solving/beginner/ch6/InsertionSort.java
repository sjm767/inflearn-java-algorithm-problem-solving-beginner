package inflearn.java.algorithm.problem.solving.beginner.ch6;

/**
 * 3. 삽입 정렬
 */
public class InsertionSort {

  static int[] solution(int n, int[] arr) {

    for (int i = 1; i < n; i++) {
      int j;
      int tmp = arr[i];
      for (j = i - 1; j >= 0; j--) {
        if (arr[j] > tmp) {
          arr[j + 1] = arr[j];
        } else {
          break;
        }
      }
      arr[j + 1] = tmp;
    }

    return arr;
  }

  public static void main(String[] args) {
    int n = 6;
    int[] arr = {13, 5, 11, 7, 23, 15};

    int[] answer = solution(n, arr);
    for (int a : answer) {
      System.out.print(a + " ");
    }
  }
}
