package inflearn.java.algorithm.problem.solving.beginner.ch5;

import java.util.Stack;

/**
 * 5. 쇠막대기
 */
public class IronRod {
  static int solution(String s){
    int answer = 0;
    Stack<Character> stack = new Stack<>();

    for (int i =0;i<s.length();i++) {
      if(s.charAt(i) == '('){
        stack.push(s.charAt(i));
      }else{
        stack.pop();
        //레이저
        if(s.charAt(i-1) == '('){
          answer+=stack.size();
        }else{
          answer++;
        }
      }
    }
    return answer;
  }

  public static void main(String[] args) {
    String s = "()(((()())(())()))(())";
    s = "(((()(()()))(())()))(()())";
    System.out.println(solution(s));
  }
}
