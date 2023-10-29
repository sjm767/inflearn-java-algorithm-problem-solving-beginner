package inflearn.java.algorithm.problem.solving.beginner.ch7;

public final class RecursiveUtil {

  private RecursiveUtil() {

  }

  /**
   * 1. 재귀 함수
   *
   * @param n
   */
  public static void print(int n) {
    if (n == 0) {
      return;
    } else {
      print(n - 1);
      System.out.print(n + " ");
    }
  }

  /**
   * 2. 이진수 출력
   *
   * @param n
   */
  public static void binaryNumber(int n) {
    if (n == 0) {
      return;
    } else {
      binaryNumber(n / 2);
      System.out.print(n % 2);
    }
  }

  /**
   * 3. 팩토리얼
   *
   * @param n
   */
  public static int factorial(int n) {
    if (n == 1) {
      return 1;
    } else {
      return n * factorial(n - 1);
    }
  }


}
