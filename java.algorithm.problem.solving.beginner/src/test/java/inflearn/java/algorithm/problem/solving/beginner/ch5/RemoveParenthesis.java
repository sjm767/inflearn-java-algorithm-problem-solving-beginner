package inflearn.java.algorithm.problem.solving.beginner.ch5;

import java.util.Stack;

/**
 * 2. 괄호문자제거
 */
public class RemoveParenthesis {

  static String solution(String s){
    StringBuilder sb = new StringBuilder();
    Stack<Character> stack = new Stack<>();

    for (Character c : s.toCharArray()) {
      if(c == ')'){
        while(stack.pop()!='('){

        }
      }else{
        stack.push(c);
      }
    }

    for (Character c : stack) {
      sb.append(c + "");
    }
    return sb.toString();
  }
  public static void main(String[] args) {
    String s = "(A(BC)D)EF(G(H)(IJ)K)LM(N)";
    System.out.println(solution(s));


  }
}
