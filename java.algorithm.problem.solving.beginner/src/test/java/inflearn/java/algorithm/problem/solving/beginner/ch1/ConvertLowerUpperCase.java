package inflearn.java.algorithm.problem.solving.beginner.ch1;

/**
 * 2. 대소문자 변환
 */
public class ConvertLowerUpperCase {

  static String solution(String s){
    StringBuilder sb = new StringBuilder();

    for (char c : s.toCharArray()) {
      if (Character.isUpperCase(c)) {
        sb.append(Character.toLowerCase(c));
      }else{
        sb.append(Character.toUpperCase(c));
      }
    }

    return sb.toString();
  }

  public static void main(String[] args) {
    String str = "StuDY";
    System.out.println(solution(str));
  }
}
