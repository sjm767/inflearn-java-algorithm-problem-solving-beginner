package inflearn.java.algorithm.problem.solving.beginner.ch6;

import java.util.HashSet;
import java.util.Set;

/**
 * 5. 중복 확인
 */
public class CheckDuplication {

  static String solution(int n, int[] arr) {
    String answer = "U";

    Set<Integer> set = new HashSet<>();

    for (int a : arr) {
      set.add(a);
    }

    if (set.size() != n) {
      return "D";
    }
    return answer;
  }

  public static void main(String[] args) {
    int n=9;
    int[] arr = {20,25,52,30,39,33,43,33};

    System.out.println(solution(n, arr));

  }
}
