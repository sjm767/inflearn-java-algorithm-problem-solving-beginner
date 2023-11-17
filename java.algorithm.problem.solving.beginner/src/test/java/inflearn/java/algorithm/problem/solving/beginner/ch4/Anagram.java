package inflearn.java.algorithm.problem.solving.beginner.ch4;

import java.util.HashMap;
import java.util.Map;

/**
 * 2. 아나그램 (해쉬)
 */
public class Anagram {

  static String solution(String a,String b) {
    String answer = "NO";

    Map<Character, Integer> aMap = new HashMap<>();
    Map<Character, Integer> bMap = new HashMap<>();

    for (Character c : a.toCharArray()) {
      aMap.put(c, aMap.getOrDefault(c, 0) + 1);
    }
    for (Character c : b.toCharArray()) {
      bMap.put(c, bMap.getOrDefault(c, 0) + 1);
    }

    if (aMap.equals(bMap)) {
      return "YES";
    }

    return answer;
  }

  public static void main(String[] args) {
    String a = "AbaAeCe";
    String b = "baeeACA";

    System.out.println(solution(a, b));

  }
}
