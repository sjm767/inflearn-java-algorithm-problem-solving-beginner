package inflearn.java.algorithm.problem.solving.beginner.code;

import java.util.*;

public final class ArrayUtil {

  private ArrayUtil() {

  }

  /**
   * 1. 큰 수 출력하기
   *
   * @param n
   * @param arr
   * @return
   */
  public static List<Integer> printBigInt(int n, int[] arr) {
    List<Integer> answer = new ArrayList<>();

    answer.add(arr[0]);

    for (int i = 1; i < arr.length; i++) {
      if (arr[i] > arr[i - 1]) {
        answer.add(arr[i]);
      }
    }

    return answer;
  }

  /**
   * 2. 보이는 학생
   *
   * @param n
   * @param arr
   * @return
   */
  public static int visibleStudents(int n, int[] arr) {
    int answer = 1;
    int max = arr[0];

    for (int nn : arr) {
      if (max < nn) {
        answer++;
        max = nn;
      }
    }
    return answer;
  }

  /**
   * 3. 가위바위보
   *
   * @param n
   * @param a
   * @param b
   * @return
   */

  public static String[] rockPaperScissors(int n, int[] a, int[] b) {
    String[] answer = new String[n];

    for (int i = 0; i < n; i++) {
      if (a[i] == b[i]) {
        answer[i] = "D";
      } else if ((a[i] == 2 && b[i] == 1) || (a[i] == 1 && b[i] == 3) || (a[i] == 3 && b[i] == 2)) {
        answer[i] = "A";
      } else {
        answer[i] = "B";
      }
    }

    return answer;
  }

  /**
   * 4. 피보나치 수열
   *
   * @param n
   * @return
   */
  public static int[] fibonacci(int n) {
    int[] answer = new int[n];
    answer[0] = 1;
    answer[1] = 1;

    for (int i = 2; i < n; i++) {
      answer[i] = answer[i - 2] + answer[i - 1];
    }
    return answer;
  }

  /**
   * 5. 소수(에라토스테네스 체)
   *
   * @param n
   * @return
   */
  public static int eratosthenes(int n) {
    int answer = 0;
    int num[] = new int[n + 1];

    num[0] = 1;
    num[1] = 1;
    for (int i = 2; i <= n; i++) {
      if (num[i] == 0) {
        answer++;
        for (int j = i; j <= n; j = j + i) {
          num[j] = 1;
        }
      }
    }

    return answer;
  }

  /**
   * 6. 뒤집은 소수
   *
   * @param n
   * @param arr
   * @return
   */
  public static List<Integer> reversePrime(int n, int[] arr) {
    List<Integer> answer = new ArrayList<>();

    for (int num : arr) {
      int tmp = num;
      int reverse = 0;
      while (tmp > 0) {
        int t = tmp % 10;
        reverse = reverse * 10 + t;
        tmp = tmp / 10;
      }

      boolean isPrime = true;
      if (reverse == 1) {
        isPrime = false;
      } else {
        for (int i = 2; i < reverse; i++) {
          if (reverse % i == 0) {
            isPrime = false;
            break;
          }
        }
      }

      if (isPrime) {
        answer.add(reverse);
      }
    }

    return answer;
  }

  /**
   * 7. 점수계산
   *
   * @param n
   * @param arr
   * @return
   */
  public static int calculateScore(int n, int[] arr) {
    int answer = 0;

    int cnt = 0;
    for (int i = 0; i < n; i++) {
      if (arr[i] == 1) {
        cnt++;
        answer += cnt;
      } else {
        cnt = 0;
      }
    }

    return answer;
  }

  /**
   * 8. 등수 구하기
   *
   * @param n
   * @param arr
   * @return
   */
  public static int[] rank(int n, int[] arr) {
    int[] answer = new int[n];

    int rank;
    for (int i = 0; i < n; i++) {
      rank = 1;
      for (int j = 0; j < n; j++) {
        if (arr[i] < arr[j]) {
          rank++;
        }
      }
      answer[i] = rank;
    }

    return answer;
  }

  /**
   * 9. 격자판 최대합
   *
   * @param n
   * @param arr
   * @return
   */
  public static int maxGridSum(int n, int[][] arr) {
    int answer = Integer.MIN_VALUE;

    int sum1 = 0;
    int sum2 = 0;

    //행렬 합
    for (int i = 0; i < n; i++) {
      sum1 = sum2 = 0;
      for (int j = 0; j < arr[i].length; j++) {
        sum1 += arr[i][j];
        sum2 += arr[j][i];
      }

      answer = Math.max(answer, sum1);
      answer = Math.max(answer, sum2);

    }

    sum1 = sum2 = 0;

    //대각선 합
    for (int i = 0; i < n; i++) {
      sum1 += arr[i][i];
      sum2 += arr[i][n - i - 1];
    }
    answer = Math.max(answer, sum1);
    answer = Math.max(answer, sum2);

    return answer;
  }

  /**
   * 10. 봉우리
   *
   * @param n
   * @param arr
   * @return
   */
  public static int peak(int n, int[][] arr) {
    int answer = 0;

    int[] dx = {-1, 0, 1, 0};
    int[] dy = {0, 1, 0, -1};
    boolean isPeak=false;

    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        isPeak = true;
        for(int k=0;k<4;k++){
          int nx = i+dx[k];
          int ny = j+dy[k];
          if(nx>=0 && nx<n && ny>=0 && ny<n && arr[nx][ny]>=arr[i][j]){
            isPeak=false;
            break;
          }
        }
        if(isPeak){
          answer++;
        }
      }
    }

    return answer;
  }

  /**
   * 11. 임시반장 정하기
   * @param n
   * @param arr
   * @return
   */
  public static int tempClassPresident(int n,int [][]arr){
    int answer = 0;
    int max = Integer.MIN_VALUE;

    int cnt = 0;

    for(int i=0;i<n;i++){
      cnt = 0;
      for(int j=0;j<n;j++){
        for(int k=0;k<5;k++){
          if(arr[i][k] == arr[j][k]){
            cnt++;
            break;
          }
        }
      }
      if(max < cnt){
        max = cnt;
        answer = i+1;
      }
    }

    return answer;
  }
}
