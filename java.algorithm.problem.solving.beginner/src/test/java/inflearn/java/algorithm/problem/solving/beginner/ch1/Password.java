package inflearn.java.algorithm.problem.solving.beginner.ch1;

import java.util.ArrayList;
import java.util.List;

/**
 * 12. 암호
 */
public class Password {

  static String solution(int n,String s){
    List<String> list = new ArrayList<>();
    char[] ch = new char[n];

    while(s.length()>0){
      String sub = s.substring(0,7);
      sub = sub.replace("#","1").replace("*","0");
      list.add(sub);

      s = s.substring(7);
    }

    for (int i = 0; i < n; i++) {
      ch[i] = (char) Integer.parseInt(list.get(i), 2);
    }

    return String.valueOf(ch);
  }

  public static void main(String[] args) {

    int n = 4;
    String s = "#****###**#####**#####**##**";

    System.out.println(solution(n, s));
  }
}
