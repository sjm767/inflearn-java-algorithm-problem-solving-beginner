package inflearn.java.algorithm.problem.solving.beginner.ch5;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 7. 교육과정 설계
 */
public class CurriculumDesign {

  static String solution(String a,String b) {
    String answer = "YES";
    Queue<Character> queue = new LinkedList<>();

    for (Character c : a.toCharArray()) {
      queue.offer(c);
    }

    for (Character c : b.toCharArray()) {
      if (queue.contains(c)) {
        if (queue.peek() != c) {
          return "NO";
        }
        queue.poll();
      }
    }

    if(queue.size() > 0){
      return "NO";
    }
    return answer;
  }
  public static void main(String[] args) {
    String a="AKDEF";
    String b="AYKGDHEJ";

    System.out.println(solution(a, b));
  }
}
