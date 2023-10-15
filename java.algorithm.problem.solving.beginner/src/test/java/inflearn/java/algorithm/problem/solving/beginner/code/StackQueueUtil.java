package inflearn.java.algorithm.problem.solving.beginner.code;

import java.net.Inet4Address;
import java.util.*;

public final class StackQueueUtil {

  private StackQueueUtil() {

  }

  /**
   * 1. 올바른 괄호
   *
   * @param a
   * @return
   */
  public static String correctParentheses(String a) {
    String answer = "YES";

    Stack<Character> stack = new Stack<>();

    for (Character c : a.toCharArray()) {
      if (c == '(') {
        stack.push(c);
      } else {
        if (stack.isEmpty()) {
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

  /**
   * 2. 괄호문자제거
   *
   * @param a
   * @return
   */
  public static String removeParentheses(String a) {
    String answer = "";
    StringBuilder sb = new StringBuilder();

    Stack<Character> stack = new Stack<>();

    for (Character c : a.toCharArray()) {
      if (c == '(') {
        stack.push(c);
      } else if (c == ')') {
        stack.pop();
      } else {
        if (stack.isEmpty()) {
          sb.append(c);
        }
      }
    }

    answer = sb.toString();
    return answer;
  }

  /**
   * 3. 크레인 인형 뽑기
   *
   * @param n
   * @param arr
   * @param m
   * @param moves
   * @return
   */
  public static int craneDollPulling(int n, int[][] arr, int m, int[] moves) {
    int answer = 0;

    Stack<Integer> stack = new Stack<>();

    for (Integer move : moves) {
      move = move - 1;
      for (int i = 0; i < arr.length; i++) {
        if (arr[i][move] != 0) {
          int tmp = arr[i][move];
          if (!stack.isEmpty() && tmp == stack.peek()) {
            stack.pop();
            answer += 2;
          } else {
            stack.push(arr[i][move]);
          }
          arr[i][move] = 0;
          break;
        }
      }
    }
    return answer;
  }

  /**
   * 4. 후위식 연산 (postfix)
   * @param str
   * @return
   */
  public static int postfix(String str){

    int sum = 0;
    Stack<Integer> stack = new Stack<>();

    int a,b;

    for (Character c : str.toCharArray()) {

      if(Character.isDigit(c)) {
        stack.push(c-48);
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
}