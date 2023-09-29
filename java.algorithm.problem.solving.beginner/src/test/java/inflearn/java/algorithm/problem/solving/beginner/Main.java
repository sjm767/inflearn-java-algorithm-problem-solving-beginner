package inflearn.java.algorithm.problem.solving.beginner;

import java.util.*;

public class Main {
  public static int[] solution(String s,char c){
    int[] answer = new int[s.length()];
    int p = 1000;

    //왼쪽에서 오른쪽으로
    for (int i = 0; i < s.length(); i++) {
      if (s.charAt(i) == c) {
        p = 0;
        answer[i] = p;
      } else {
        p++;
        answer[i] = p;
      }
    }
    p = 1000;

    //오른쪽에서 왼쪽으로
    for (int i = s.length() - 1; i >= 0; i--) {
      if (s.charAt(i) == c) {
        p = 0;
        answer[i] = p;
      } else {
        p++;
        answer[i] = Math.min(answer[i], p);
      }
    }

    return answer;
  }
  public static void main(String[] args) {
    Scanner kb = new Scanner(System.in);

    String str=kb.next();
    char c = kb.next().charAt(0);
    int[] result = solution(str, c);

    for (int n : result) {
      System.out.print(n+" ");
    }

  }

}
