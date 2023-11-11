package inflearn.java.algorithm.problem.solving.beginner.ch1;

/**
 * 8. 유효한 팰린드롬
 */
public class ValidPalindrome {

  static String solution(String s) {

    s = s.toUpperCase().replaceAll("[^A-Z]","");
    StringBuilder sb = new StringBuilder(s);

    if (s.equals(sb.reverse().toString())) {
      return "YES";
    }

    return "NO";
  }

  public static void main(String[] args) {
    String s = "found7, timk: study; Yduts; emit, 7Dnuof";
    System.out.println(solution(s));

  }
}
