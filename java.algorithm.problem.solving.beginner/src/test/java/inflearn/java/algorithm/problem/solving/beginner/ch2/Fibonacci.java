package inflearn.java.algorithm.problem.solving.beginner.ch2;

/**
 * 4. 피보나치 수열
 */
public class Fibonacci {

  static void fibonacci(int n) {
    int[] arr = new int[n];

    arr[0] = 1;
    arr[1] = 1;

    System.out.print(arr[0]+" ");
    System.out.print(arr[1]+" ");

    for (int i = 2; i < n; i++) {
      arr[i] = arr[i-2]+arr[i-1];

      System.out.print(arr[i]+" ");
    }

  }

  public static void main(String[] args) {
    int n = 10;

    fibonacci(n);
  }
}
