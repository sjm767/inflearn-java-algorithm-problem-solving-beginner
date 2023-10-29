package inflearn.java.algorithm.problem.solving.beginner.ch3;

import java.util.*;

public final class TwoPointersUtil {

  private TwoPointersUtil() {

  }

  /**
   * 1. 두 배열 합치기
   *
   * @param n
   * @param arr1
   * @param m
   * @param arr2
   * @return
   */

  public static int[] mergeArray(int n, int[] arr1, int m, int[] arr2) {
    int[] answer = new int[n + m];
    int idx = 0;
    int lt = 0;
    int rt = 0;

    while (lt < n && rt < m) {
      if (arr1[lt] < arr2[rt]) {
        answer[idx++] = arr1[lt++];
      } else {
        answer[idx++] = arr2[rt++];
      }
    }

    while (lt < n) {
      answer[idx++] = arr1[lt++];
    }

    while (rt < m) {
      answer[idx++] = arr2[rt++];
    }
    return answer;
  }

  /**
   * 2. 공통원소 구하기
   *
   * @param n
   * @param arr1
   * @param m
   * @param arr2
   * @return
   */
  public static List<Integer> commonElement(int n, int[] arr1, int m, int[] arr2) {
    List<Integer> answer = new ArrayList<>();
    int lt = 0, rt = 0;

    Arrays.sort(arr1);
    Arrays.sort(arr2);

    while (lt < n && rt < m) {
      if (arr1[lt] < arr2[rt]) {
        lt++;
      } else if (arr1[lt] > arr2[rt]) {
        rt++;
      } else {
        answer.add(arr1[lt]);
        lt++;
        rt++;
      }
    }

    return answer;
  }

  /**
   * 3. 최대 매출
   *
   * @param n
   * @param k
   * @param arr
   * @return
   */

  public static int maxSales(int n, int k, int[] arr) {
    int answer = Integer.MIN_VALUE;
    int sum = 0;
    int lt = 0;
    int rt = k;

    for (int i = 0; i < k; i++) {
      sum += arr[i];
    }
    answer = sum;

    while (rt < n) {
      sum += (arr[rt++] - arr[lt++]);
      answer = Math.max(answer, sum);
    }
    return answer;
  }

  /**
   * 4. 연속 부분수열
   *
   * @param n
   * @param m
   * @param arr
   * @return
   */
  public static int partialSequence(int n, int m, int[] arr) {
    int answer = 0;
    int sum = 0;
    int lt = 0;
    int rt = 0;

    for (rt = 0; rt < n; rt++) {
      sum += arr[rt];
      if (sum == m) {
        answer++;
      }
      while (sum >= m) {
        sum -= arr[lt++];
        if (sum == m) {
          answer++;
        }
      }
    }

    return answer;
  }

  /**
   * 5. 연속된 자연수의 합 (two pointers)
   *
   * @param n
   * @return
   */
  public static int sequentialNaturalNumberSum(int n) {
    int answer = 0;
    int lt = 0;
    int rt = 0;
    int sum = 0;
    int[] arr = new int[n / 2 + 1];

    for (int i = 0; i < arr.length; i++) {
      arr[i] = i + 1;
    }

    for (rt = 0; rt < arr.length; rt++) {
      sum += arr[rt];
      if (sum == n) {
        answer++;
      }
      while (sum >= n) {
        sum -= arr[lt++];
        if (sum == n) {
          answer++;
        }
      }
    }

    return answer;
  }

  /**
   * 5. 연속된 자연수의 합 (수학적 풀이)
   *
   * @param n
   * @return
   */
  public static int sequentialNaturalNumberSumWithMath(int n) {
    int answer = 0, cnt = 1;
    n--;
    while (n > 0) {
      cnt++;
      n = n - cnt;

      if (n % cnt == 0) {
        answer++;
      }
    }

    return answer;
  }

  /**
   * 6. 최대 길이 연속부분수열
   *
   * @param n
   * @param k
   * @param arr
   * @return
   */
  public static int maxLengthContinuousPartialSequence(int n, int k, int[] arr) {
    int answer = 0;
    int cnt = 0;
    int lt = 0;
    int rt = 0;

    for (rt = 0; rt < n; rt++) {
      if(arr[rt] == 0) {
        cnt++;
      }
      while(cnt>k){
        if(arr[lt] == 0) cnt--;
        lt++;
      }
      answer = Math.max(answer, rt-lt+1);
    }

    return answer;
  }

}
