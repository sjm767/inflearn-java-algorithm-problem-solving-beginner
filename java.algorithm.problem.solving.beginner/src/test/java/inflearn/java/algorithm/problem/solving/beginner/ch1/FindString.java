package inflearn.java.algorithm.problem.solving.beginner.ch1;

import java.util.Scanner;

/**
 * 1. 문자찾기
 */
public class FindString {

  static int solution(String s, char c){
    s = s.toLowerCase();
    c = Character.toLowerCase(c);

    int answer = 0;
    for (char cc : s.toCharArray()) {
      if (cc == c) {
        answer++;
      }
    }

    return answer;
  }

  public static void main(String[] args) {
    Scanner kb = new Scanner(System.in);

    String str = kb.next();
    char c = kb.next().charAt(0);

    System.out.println(solution(str,c));

  }
}
