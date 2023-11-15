package inflearn.java.algorithm.problem.solving.beginner.ch2;

import java.util.Arrays;

/**
 * 10. 봉우리
 */
public class Peak {

  static int[] dx = {0, 1, 0, -1};
  static int[] dy = {-1, 0, 1, 0};

  static int solution(int n, int[][] arr) {
    int answer = 0;

    int[][] copy = new int[n][n];

    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {

        boolean isBong = true;
        for (int k = 0; k < 4; k++) {
          int nx = i + dx[k];
          int ny = j + dy[k];

          if ((nx >= 0 && nx < n) && (ny >= 0 && ny < n)) {
            if (arr[nx][ny] > arr[i][j]) {
              isBong = false;
              break;
            }
          }
        }

        if (isBong) {
          copy[i][j] = 1;
        }

      }
    }

    return answer;
  }

  public static void main(String[] args) {
    int n = 5;
    int[][] arr = {{5, 3, 7, 2, 3}, {3, 7, 1, 6, 1}, {7, 2, 5, 3, 4}, {4, 3, 6, 4, 1},
        {8, 7, 3, 5, 2}};

    System.out.println(solution(n, arr));
  }
}
