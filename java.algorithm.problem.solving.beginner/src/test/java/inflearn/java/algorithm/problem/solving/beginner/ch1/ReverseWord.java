package inflearn.java.algorithm.problem.solving.beginner.ch1;

import java.util.ArrayList;
import java.util.List;

/**
 * 4. 단어뒤집기
 */
public class ReverseWord {

  static String[] solution(int n, String[] s) {
    List<String> answer = new ArrayList<>();

    for (String ss : s) {
      StringBuilder sb = new StringBuilder(ss);
      answer.add(sb.reverse().toString());
    }

    return answer.toArray(new String[0]);

  }

  public static void main(String[] args) {
    int n = 3;
    String[] s = {"good", "Time", "Big"};

    String[] answer = solution(n, s);
    for (String ans : answer) {
      System.out.println(ans);
    }
  }
}
