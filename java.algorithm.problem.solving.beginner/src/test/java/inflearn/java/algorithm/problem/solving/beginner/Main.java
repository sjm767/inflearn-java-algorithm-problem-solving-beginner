package inflearn.java.algorithm.problem.solving.beginner;

import java.util.*;

public class Main {

  static String solution(String s){
    String answer = "YES";
    Stack<Character> stack = new Stack<>();

    for (Character c : s.toCharArray()) {
      if(c == '('){
        stack.push(c);
      }else{
        if(stack.isEmpty()){
          return "NO";
        }
        stack.pop();
      }
    }

    if (!stack.isEmpty()) {
      return "NO";
    }

    return answer;
  }
  public static void main(String[] args) {
    Scanner kb = new Scanner(System.in);
    String s = kb.next();

    System.out.println(solution(s));
  }
}
