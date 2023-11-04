package inflearn.java.algorithm.problem.solving.beginner.ch8;

/**
 * 5. 동전교환
 */
public class ExchangeCoin {

  static int n;
  static int[] types;
  static int m;
  static int answer = Integer.MAX_VALUE;

  static void DFS(int L, int sum) {
    if (sum > m || L >= answer) {
      return;
    }
    if (sum == m) {
      answer = L;
    } else {
      for (int i = n - 1; i >= 0; i--) {
        DFS(L + 1, sum + types[i]);
      }
    }

  }

  public static void main(String[] args) {

    n = 3;
    types = new int[]{1, 2, 5};
    m = 15;

    DFS(0, 0);
    System.out.println(answer);
  }
}
