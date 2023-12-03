package inflearn.java.algorithm.problem.solving.beginner.ch10;

/**
 * 3. 최대 부분 증가 수열
 */
public class MaxSubSequential {

  static int solution(int n, int[] arr) {
    int answer = 0;
    int[] dis = new int[n];
    dis[0] = 1;

    for (int i = 1; i < n; i++) {
      int max = 0;
      for (int j = i - 1; j >= 0; j--) {
        if (arr[j] < arr[i] && dis[j] > max) {
          max = dis[j];
        }
      }
      dis[i] = max+1;
      answer = Math.max(answer, dis[i]);
    }

    return answer;
  }

  public static void main(String[] args) {
    int n = 8;
    int[] arr = {5, 3, 7, 8, 6, 2, 9, 4};

    System.out.println(solution(n, arr));
  }

}
