package inflearn.java.algorithm.problem.solving.beginner.ch3;

/**
 * 5. 연속된 자연수의 합
 */
public class SequentialSum {

  static int solution(int n) {
    int answer = 0;
    int sum = 0;
    int lt = 0;
    int max = n / 2 + 1;

    int[] arr = new int[max];
    for (int i = 0; i < max; i++) {
      arr[i] = i + 1;
    }

    for (int rt = 0; rt < max; rt++) {
      sum += arr[rt];
      if (sum == n) {
        answer++;
      } else if (sum > n) {
        while (sum > n) {
          sum -= arr[lt];
          lt++;
          if (sum == n) {
            answer++;
          }
        }
      }
    }

    return answer;
  }

  public static void main(String[] args) {
    int n = 15;
    System.out.println(solution(n));
  }
}
