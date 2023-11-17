package inflearn.java.algorithm.problem.solving.beginner.ch4;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

/**
 * 1. 학급회장 (해쉬)
 */
public class ClassLeader {

  static char solution(int n, String s) {
    Map<Character, Integer> map = new HashMap<>();

    for (Character c : s.toCharArray()) {
      map.put(c,map.getOrDefault(c,0)+1);
    }

    return map.entrySet()
        .stream()
        .max(Comparator.comparing(Entry::getValue))
        .orElse(null).getKey();
  }

  public static void main(String[] args) {
    int n = 15;
    String s = "BACBACCACCBDEDE";

    System.out.println(solution(n, s));
  }
}
