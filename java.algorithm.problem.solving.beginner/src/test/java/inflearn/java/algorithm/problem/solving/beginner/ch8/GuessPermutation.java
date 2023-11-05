package inflearn.java.algorithm.problem.solving.beginner.ch8;

/**
 * 8. 수열 추측하기
 */
public class GuessPermutation {

  static int n;
  static int f;

  static int[] pm;

  static int[] combinations;

  static int[][] mem;

  static int[] ch;
  static boolean flag;

  static int combi(int n, int r) {
    if (mem[n][r] > 0) {
      return mem[n][r];
    }
    if (r == 0 || n == r) {
      return mem[n][r] = 1;
    } else {
      return mem[n][r] = combi(n - 1, r - 1) + combi(n - 1, r);
    }
  }

  static void DFS(int L, int sum) {
    if (flag) {
      return;
    }
    if (L == n) {
      if (sum == f) {
        for (int nn : pm) {
          System.out.print(nn + " ");
        }
        flag = true;
        System.out.println();
      }
    } else {
      for (int i = 1; i <= n; i++) {
        if (ch[i] == 0) {
          ch[i] = 1;
          pm[L] = i;
          DFS(L + 1, sum + (combinations[L] * pm[L]));
          ch[i] = 0;
        }
      }
    }

  }

  public static void main(String[] args) {
    n = 4;
    f = 16;
    mem = new int[n + 1][n + 1];
    pm = new int[n];
    combinations = new int[n];
    ch = new int[n + 1];

    for (int i = 0; i < n; i++) {
      combinations[i] = combi(n - 1, i);
    }
    DFS(0, 0);
  }
}
