package inflearn.java.algorithm.problem.solving.beginner.ch4;

import ch.qos.logback.core.UnsynchronizedAppenderBase;
import java.util.HashMap;
import java.util.Map;

/**
 * 4. 모든 아나그램 찾기
 */
public class AllAnagram {

  static int solution(String s,String t) {
    int answer = 0;
    Map<Character, Integer> tMap = new HashMap<>();
    for (Character c : t.toCharArray()) {
      tMap.put(c,tMap.getOrDefault(c,0) + 1);
    }

    Map<Character, Integer> sMap = new HashMap<>();
    int lt = 0;
    int rt =t.length();

    for(int i=0;i<rt;i++){
      sMap.put(s.charAt(i), sMap.getOrDefault(s.charAt(i),0) +1);
    }

    if (sMap.equals(tMap)) {
      answer++;
    }

    for (int i = rt; i < s.length(); i++) {
      sMap.put(s.charAt(i) , sMap.getOrDefault(s.charAt(i),0)+1);

      if(sMap.get(s.charAt(lt)) == 1){
        sMap.remove(s.charAt(lt));
      }
      else{
        sMap.put(s.charAt(lt),sMap.get(s.charAt(lt))-1);
      }
      if (sMap.equals(tMap)) {
        answer++;
      }

      lt++;
    }

    return answer;
  }
  public static void main(String[] args) {
    String s ="bacaAacba";
    String t = "abc";

    System.out.println(solution(s, t));

  }
}
