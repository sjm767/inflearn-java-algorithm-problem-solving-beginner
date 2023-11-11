package inflearn.java.algorithm.problem.solving.beginner.ch1;

/**
 * 3. 문장 속 단어
 */
public class WordInString {

  static String solution(String s){
    String answer ="";
    int max = Integer.MIN_VALUE;

    String[] sp = s.split(" ");

    for (String ss : sp) {
      if (ss.length() > max) {
        answer = ss;
        max = ss.length();
      }
    }

    return answer;

  }
  public static void main(String[] args) {
    String s = "it is time to study";

    System.out.println(solution(s));
  }
}
