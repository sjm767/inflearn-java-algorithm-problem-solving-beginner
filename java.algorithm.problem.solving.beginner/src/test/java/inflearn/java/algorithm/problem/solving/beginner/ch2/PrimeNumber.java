package inflearn.java.algorithm.problem.solving.beginner.ch2;

/**
 * 5. 소수 (에라토스테네스 체)
 */
public class PrimeNumber {

  static int solution(int n) {
    int[] arr = new int[n+1];
    int answer = 0;

    int num = 2;
    while (num <= n) {

      for (int i = num; i <= n; i+=num) {
        arr[i] = arr[i]+1;

      }
      num++;
    }

    for (int nn : arr) {
      if (nn == 1) {
        answer++;
      }
    }

    return answer;
  }

  public static void main(String[] args) {
    int n=20;

    System.out.println(solution(n));

  }

}
