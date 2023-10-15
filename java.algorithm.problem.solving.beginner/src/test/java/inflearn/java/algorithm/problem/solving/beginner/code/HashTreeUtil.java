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
   *
   * @param n
   * @param k
   * @param arr
   * @return
   */
  public static int[] salesKind(int n, int k, int[] arr) {
    List<Integer> answer = new ArrayList<>();

    int lt = 0, rt = 0;
    Map<Integer, Integer> map = new HashMap<>();

    for (rt = 0; rt < k; rt++) {
      map.put(arr[rt], map.getOrDefault(arr[rt], 0) + 1);
    }
    answer.add(map.size());

    while (rt < n) {
      map.put(arr[lt], map.get(arr[lt]) - 1);
      if (map.get(arr[lt]) <= 0) {
        map.remove(arr[lt]);
      }
      map.put(arr[rt], map.getOrDefault(arr[rt], 0) + 1);
      lt++;
      rt++;

      answer.add(map.size());
    }
    return answer.stream().mapToInt(Integer::intValue).toArray();
  }

  /**
   * 4. 모든 아나그램 찾기
   *
   * @param s
   * @param t
   * @return
   */
  public static int allAnagram(String s, String t) {
    int answer = 0;

    int lt = 0;
    int rt = 0;
    Map<Character, Integer> sMap = new HashMap<>();
    Map<Character, Integer> tMap = new HashMap<>();

    for (Character c : t.toCharArray()) {
      tMap.put(c, tMap.getOrDefault(c, 0) + 1);
    }

    for (rt = 0; rt < t.length(); rt++) {
      sMap.put(s.charAt(rt), sMap.getOrDefault(s.charAt(rt), 0) + 1);
    }

    while (rt < s.length()) {
      if (sMap.equals(tMap)) {
        answer++;
      }

      //lt제거 후 한 단계 전진
      sMap.put(s.charAt(lt), sMap.get(s.charAt(lt)) - 1);
      if (sMap.get(s.charAt(lt)) <= 0) {
        sMap.remove(s.charAt(lt));
      }
      lt++;

      sMap.put(s.charAt(rt), sMap.getOrDefault(s.charAt(rt), 0) + 1);
      rt++;
    }

    if (sMap.equals(tMap)) {
      answer++;
    }
    return answer;
  }

  /**
   * 5. K번째 큰 수
   *
   * @param n
   * @param k
   * @param arr
   * @return
   */
  public static int largestNumberK(int n, int k, int[] arr) {
    int answer = -1;
    Set<Integer> set = new TreeSet<>(Collections.reverseOrder());

    for(int i=0;i<n;i++){
      for(int j=i+1;j<n;j++){
        for(int l = j+1;l<n;l++){
          set.add(arr[i]+arr[j]+arr[l]);
        }
      }
    }

    int cnt = 0;
    for (Integer i : set) {
      cnt++;
      if(cnt==k){
        return i;
      }
    }
    return answer;
  }
}

