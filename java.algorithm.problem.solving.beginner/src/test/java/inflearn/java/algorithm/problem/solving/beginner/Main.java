package inflearn.java.algorithm.problem.solving.beginner;

import java.util.*;

public class Main {

  public static int solution(String str) {

    int sum = 0;
    Stack<Integer> stack = new Stack<>();

    int a,b;

    for (Character c : str.toCharArray()) {

      if(c >= 48 && c <= 57) {
        stack.push(c-'0');
      }else{
        a = stack.pop();
        b = stack.pop();

        switch (c){
          case '+':
            sum=(b+a);
            break;
          case '-':
            sum=(b-a);
            break;
          case '*':
            sum=(b*a);
            break;
          case '/':
            sum=(b/a);
            break;
        }

        stack.push(sum);
      }
    }

    return sum;
  }

  public static void main(String[] args) {
    Scanner kb = new Scanner(System.in);

    String str = kb.next();
    System.out.println(solution(str));
  }

}
