package inflearn.java.algorithm.problem.solving.beginner.ch5;

import java.util.Stack;

/**
 * 4. 후위식 연산
 */
public class Postfix {

  static int solution(String s){
    Stack<Integer> stack = new Stack<>();

    for (Character c : s.toCharArray()){
      if(c >= 48 && c<=57){
        stack.push(Integer.parseInt(c+""));
      }
      else{
        int a = stack.pop();
        int b = stack.pop();
        int aa = 0;
        switch (c){
          case '+':
            aa=b+a;
            break;
          case '*':
            aa=b*a;
            break;
          case '-':
            aa=b-a;
            break;
          case '/':
            aa=b/a;
            break;
        }

        stack.push(aa);
      }
    }

    return stack.pop();
  }
  public static void main(String[] args) {
    String s = "352+*9-";
    System.out.println(solution(s));
  }
}
