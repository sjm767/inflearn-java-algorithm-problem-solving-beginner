package inflearn.java.algorithm.problem.solving.beginner.ch1;

import java.util.HashMap;
import java.util.Map;

/**
 * 6. 중복문자제거
 */
public class RemoveDuplicateWord {

  static String solution(String s) {
    Map<Character, Integer> map = new HashMap<>();
    String answer="";

    for (char c : s.toCharArray()) {
      if(map.getOrDefault(c,0) == 0){
        answer += c;
        map.put(c,1);
      }
    }

    return answer;
  }

  public static void main(String[] args) {
    String s = "ksekkset";

    System.out.println(solution(s));
  }
}
