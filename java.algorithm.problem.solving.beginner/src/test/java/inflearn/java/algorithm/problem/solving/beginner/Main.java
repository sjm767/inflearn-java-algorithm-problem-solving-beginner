package inflearn.java.algorithm.problem.solving.beginner;

import java.util.*;

public class Main {

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
    Scanner kb = new Scanner(System.in);
    String a=kb.next();
    String b = kb.next();

    System.out.println(solution(a, b));
  }
}
