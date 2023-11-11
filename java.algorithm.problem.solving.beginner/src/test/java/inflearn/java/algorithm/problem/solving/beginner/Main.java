package inflearn.java.algorithm.problem.solving.beginner;

import java.util.*;

public class Main {
  static String solution(String s) {

    s = s.toLowerCase().replaceAll("[^A-Z]","");
    StringBuilder sb = new StringBuilder(s);

    if (s.equals(sb.reverse().toString())) {
      return "YES";
    }

    return "NO";
  }

  public static void main(String[] args) {
    Scanner kb = new Scanner(System.in);
    String s = kb.nextLine();
    System.out.println(solution(s));

  }
}
