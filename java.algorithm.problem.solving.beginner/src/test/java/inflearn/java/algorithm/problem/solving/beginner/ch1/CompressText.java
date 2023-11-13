package inflearn.java.algorithm.problem.solving.beginner.ch1;

/**
 * 11. 문자열 압축
 */
public class CompressText {

  static String solution(String s) {
    StringBuilder sb = new StringBuilder();

    int ct = 1;
    char cc = s.charAt(0);
    for (int i = 1; i < s.length(); i++) {
      if(cc == s.charAt(i)){
        ct++;
      }else{
        sb.append(cc);
        if(ct > 1){
          sb.append(ct+"");
        }
        cc=s.charAt(i);
        ct = 1;
      }
    }

    sb.append(cc);
    if(ct > 1){
      sb.append(ct+"");
    }

    return sb.toString();
  }

  public static void main(String[] args) {
    String s = "KSTTTSEEKFKKKDJJGG";

    System.out.println(solution(s));

  }
}
