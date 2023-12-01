package inflearn.java.algorithm.problem.solving.beginner.ch10;

/**
 * 10. 계단오르기
 */
public class UpStair {

  static int solution(int n) {
    int[] dy = new int[n+1];

    dy[1] = 1;
    dy[2] = 2;

    for (int i = 3; i <= n; i++) {
      dy[i] = dy[i-2] + dy[i-1];
    }

    return dy[n];
  }

  public static void main(String[] args) {
    int n = 7;

    System.out.println(solution(n));
  }

}
