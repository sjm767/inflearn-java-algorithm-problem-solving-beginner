package inflearn.java.algorithm.problem.solving.beginner.ch6;

/**
 * 4. Least Recently Used
 */
public class LeastRecentlyUsed {

  static int findIdx(int a, int[] arr) {
    int idx = -1;
    for (int i = 0; i < arr.length; i++) {
      if (a == arr[i]) {
        idx = i;
        break;
      }
    }
    return idx;
  }

  static int[] solution(int s, int n, int[] arr) {
    int[] cache = new int[s];

    for (int a : arr) {
      int idx = findIdx(a, cache);
      if (idx != -1) {
        for (int i = idx; i > 0; i--) {
          cache[i] = cache[i - 1];
        }
      } else {
        for (int i = s - 1; i > 0; i--) {
          cache[i] = cache[i - 1];
        }
      }
      cache[0] = a;
    }
    return cache;
  }

  public static void main(String[] args) {
    int s = 5;
    int n = 9;
    int[] arr = {1, 2, 3, 2, 6, 2, 3, 5, 7};

    int[] answer = solution(s, n, arr);

    for (int a : answer) {
      System.out.print(a + " ");
    }
  }

}
