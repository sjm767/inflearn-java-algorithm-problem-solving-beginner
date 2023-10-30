package inflearn.java.algorithm.problem.solving.beginner.ch7;

/**
 * 4. 피보나치 재귀(메모이제이션)
 */
public class FibonacciRecursive {

  static int[] fibo;
  public static int fibonacci(int n) {
    if (fibo[n] > 0) {
      return fibo[n];
    }
    if(n == 1 || n == 2){
      return 1;
    }
    else{
      fibo[n] = fibonacci(n - 2) + fibonacci(n - 1);
      return fibo[n];
    }

  }

  public static void main(String[] args) {
    int n = 45;
    fibo = new int[n + 1];

    for (int i = 1; i <= n; i++) {
      System.out.print(fibonacci(i) + " ");
    }

  }
}
