package inflearn.java.algorithm.problem.solving.beginner.ch1;

/**
 * 5. 특정 문자 뒤집기
 */
public class ReverseTargetWord {

  static String solution(String s) {
    String answer = "";
    int lt = 0;
    int rt = s.length() - 1;
    char[] c = s.toCharArray();

    while(lt<rt){

      if(!Character.isAlphabetic(c[lt])){
        lt++;
      }
      if (!Character.isAlphabetic(c[rt])) {
        rt--;
      }

      if (Character.isAlphabetic(c[lt]) && Character.isAlphabetic(c[rt])) {
        char tmp = c[lt];
        c[lt] = c[rt];
        c[rt] = tmp;
        lt++;
        rt--;
      }
    }
    answer = String.valueOf(c);
    return answer;
  }

  public static void main(String[] args) {
    String s = "a#b!GE*T@S";

    System.out.println(solution(s));
  }
}
