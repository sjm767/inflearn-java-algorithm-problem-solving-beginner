package inflearn.java.algorithm.problem.solving.beginner.ch1;

import java.util.Arrays;

/**
 * 10. 가장 짧은 문자거리
 */
public class ShortestTextPath {

  static int[] solution(String s, char t) {
    int[] answer = new int[s.length()];
    Arrays.fill(answer, Integer.MAX_VALUE);

    int dis = 9999;

    for (int i = 0; i < s.length(); i++) {
      if(s.charAt(i) == t){
        dis = 0;
      }
      answer[i] = Math.min(answer[i],dis++);
    }

    dis=9999;

    for (int i = s.length() - 1; i >= 0; i--) {
      if(s.charAt(i) == t){
        dis = 0;
      }
      answer[i] = Math.min(answer[i],dis++);
    }

    return answer;
  }
  public static void main(String[] args) {
    String s = "teachermode";
    char t = 'e';

    int[] result = solution(s, t);
    for (int a : result) {
      System.out.print(a+" ");
    }
  }
}
