package inflearn.java.algorithm.problem.solving.beginner.code;

import java.util.*;

public final class HashTreeUtil {

  private HashTreeUtil() {

  }

  /**
   * 1. 학급 회장 (해쉬)
   *
   * @param n
   * @param str
   * @return
   */
  public static char classPresident(int n, String str) {
    int max = Integer.MIN_VALUE;
    Character maxKey = null;
    Map<Character, Integer> map = new HashMap<>();

    for (char c : str.toCharArray()) {
      map.put(c, map.getOrDefault(c, 0) + 1);
    }

    for (Character c : map.keySet()) {
      int v = map.get(c);
      if (max < v) {
        max = v;
        maxKey = c;
      }
    }

    return maxKey;
  }

  /**
   * 2. 아나그램 (해쉬)
   *
   * @param a
   * @param b
   * @return
   */
  public static String anagram(String a, String b) {
    String answer = "YES";

    Map<Character, Integer> mapA = new TreeMap<>();

    for (Character c : a.toCharArray()) {
      mapA.put(c, mapA.getOrDefault(c, 0) + 1);
    }

    for (Character c : b.toCharArray()) {
      if (!mapA.containsKey(c) || mapA.get(c) == 0) {
        return "NO";
      }
      mapA.put(c, mapA.get(c) - 1);
    }
    return answer;
  }

  /**
   * 3. 매출액의 종류
   * @param n
   * @param k
   * @param arr
   * @return
   */
  public static int[] salesKind(int n, int k, int[] arr) {
    List<Integer> answer = new ArrayList<>();

    int lt=0,rt=0;
    Map<Integer,Integer> map = new HashMap<>();

    for(rt=0;rt<k;rt++){
      map.put(arr[rt],map.getOrDefault(arr[rt],0)+1);
    }
    answer.add(map.size());

    while(rt<n){
      map.put(arr[lt],map.get(arr[lt])-1);
      if(map.get(arr[lt]) <= 0){
        map.remove(arr[lt]);
      }
      map.put(arr[rt],map.getOrDefault(arr[rt],0)+1);
      lt++;
      rt++;

      answer.add(map.size());
    }
    return answer.stream().mapToInt(Integer::intValue).toArray();
  }
}

