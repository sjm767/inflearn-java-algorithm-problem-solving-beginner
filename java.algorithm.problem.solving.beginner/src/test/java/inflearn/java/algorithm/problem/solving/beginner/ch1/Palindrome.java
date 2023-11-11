package inflearn.java.algorithm.problem.solving.beginner.ch1;

/**
 * 7. 회문 문자열
 */
public class Palindrome {

  static String solution(String s) {
    String answer = "NO";
    s = s.toLowerCase();

    StringBuilder sb = new StringBuilder(s);

    if (sb.reverse().toString().equals(s)) {
      return "YES";
    }

    return answer;
  }

  public static void main(String[] args) {
    String s = "gooG";
    System.out.println(solution(s));

  }
}
