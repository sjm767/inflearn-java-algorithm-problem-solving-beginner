package inflearn.java.algorithm.problem.solving.beginner.ch8;

/**
 * 9. 조합구하기
 */
public class MakeCombination {

  static int n;
  static int m;

  static int[] p;

  static int[] ch;

  static void DFS(int L, int start) {
    if (L == m) {
      for (int pp : p) {
        System.out.print(pp + " ");
      }
      System.out.println();
    } else {
      for (int i = start; i <= n; i++) {
          p[L] = i;
          DFS(L + 1, start + i);
        }
      }
  }

  public static void main(String[] args) {
    n = 4;
    m = 2;
    ch = new int[n + 1];
    p = new int[m];

    DFS(0, 1);
  }
}
