package inflearn.java.algorithm.problem.solving.beginner.ch2;

/**
 * 7. 점수 계산
 */
public class CalculateScore {

  static int solution(int n, int[] arr) {
    int answer = 0;

    int tmp = 0;

    for (int score : arr) {
      if (score == 1) {
        tmp++;
        answer+=tmp;
      } else {
        tmp = 0;
      }
    }

    return answer;
  }

  public static void main(String[] args) {
    int n = 10;
    int[] arr = {1, 0, 1, 1, 1, 0, 0, 1, 1, 0};

    System.out.println(solution(n, arr));

  }
}
