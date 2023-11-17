package inflearn.java.algorithm.problem.solving.beginner.ch5;

import java.util.Stack;

public class CorrectParenthesis {

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
    String s = "(()(()))(()";

    System.out.println(solution(s));
  }

}
