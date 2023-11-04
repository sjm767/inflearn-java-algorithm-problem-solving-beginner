package inflearn.java.algorithm.problem.solving.beginner.ch8;

/**
 * 6. 순열구하기 (중복X)
 */
public class Permutation {

  static int n;
  static int m;

  static int[] arr;
  static int[] pm;
  static int[] ch;

  static void DFS(int L) {
    if (L == m) {
      for (int p : pm) {
        System.out.print(p + " ");
      }
      System.out.println();
    } else {
      for (int i = 0; i < n; i++) {
        if (ch[i] != 1) {
          ch[i] = 1;
          pm[L] = arr[i];
          DFS(L + 1);
          ch[i] = 0;
        }
      }
    }
  }

  public static void main(String[] args) {
    n = 3;
    m = 2;
    arr = new int[]{3, 6, 9};
    ch = new int[n];
    pm = new int[m];

    DFS(0);


  }
}
