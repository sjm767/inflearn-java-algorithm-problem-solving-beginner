package inflearn.java.algorithm.problem.solving.beginner.ch8;

/**
 * 4. 중복순열 구하기
 */
public class DuplicatePermutation {

  static int pm[];
  static int n;
  static int m;

  static void DFS(int L) {
    if (L == m) {
      for (int num : pm) {
        System.out.print(num+" ");
      }
      System.out.println();
    } else {
      for (int i = 1; i <= n; i++) {
        pm[L] = i;
        DFS(L + 1);
      }
    }
  }

  public static void main(String[] args) {
    n = 3;
    m = 2;

    pm = new int[m];
    DFS(0);
  }

}
