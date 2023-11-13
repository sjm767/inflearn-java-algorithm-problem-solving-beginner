package inflearn.java.algorithm.problem.solving.beginner.ch1;

/**
 * 9. 숫자만 추출
 */
public class ExtractNumber {

  static int solution(String s) {
    int answer = 0;

    for (Character c : s.toCharArray()) {
      if (c >= 48 && c <= 57) {
        answer = answer * 10 + (c-48);
      }
    }
    return answer;
  }
  public static void main(String[] args) {
    String s="g0en2T0s8eSoft";

    System.out.println(solution(s));
  }
}
