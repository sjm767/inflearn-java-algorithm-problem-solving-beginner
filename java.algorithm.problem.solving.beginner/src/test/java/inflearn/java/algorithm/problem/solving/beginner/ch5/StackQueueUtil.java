package inflearn.java.algorithm.problem.solving.beginner.ch5;

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
   *
   * @param str
   * @return
   */
  public static int postfix(String str) {

    int sum = 0;
    Stack<Integer> stack = new Stack<>();

    int a, b;

    for (Character c : str.toCharArray()) {

      if (Character.isDigit(c)) {
        stack.push(c - 48);
      } else {
        a = stack.pop();
        b = stack.pop();

        switch (c) {
          case '+':
            sum = (b + a);
            break;
          case '-':
            sum = (b - a);
            break;
          case '*':
            sum = (b * a);
            break;
          case '/':
            sum = (b / a);
            break;
        }

        stack.push(sum);
      }
    }

    return sum;
  }

  /**
   * 5. 쇠 막대기
   *
   * @param a
   * @return
   */
  public static int ironRod(String a) {
    int answer = 0;
    Stack<Character> stack = new Stack<>();
    int cnt = 0;

    for (int i = 0; i < a.length(); i++) {
      if (a.charAt(i) == '(') {
        cnt++;
        stack.push(a.charAt(i));
      } else {
        cnt--;
        //레이저
        if (a.charAt(i - 1) == '(') {
          stack.pop();
          answer += cnt;
        } else {
          answer++;
        }
      }
    }

    return answer;
  }

  /**
   * 6. 공주구하기
   * @param n
   * @param k
   * @return
   */
  public static int savePrincess(int n,int k){
    int answer = Integer.MIN_VALUE;
    Queue<Integer> queue = new LinkedList<>();

    for(int i=1;i<=n;i++){
      queue.offer(i);
    }

    while (!queue.isEmpty()) {
      for(int i=1;i<k;i++){
        queue.offer(queue.poll());
      }
      queue.poll();
      if(queue.size() == 1){
        answer = queue.poll();
      }
    }

    return answer;
  }

  /**
   * 7. 교육과정 설계
   * @param a
   * @param b
   * @return
   */
  public static String curriculumDesign(String a, String b){
    String answer = "YES";
    Queue<Character> queue = new LinkedList<>();

    for (Character c : a.toCharArray()) {
      queue.offer(c);
    }

    for (Character c : b.toCharArray()) {
      if (queue.contains(c)) {
        Character poll = queue.poll();
        if (c != poll) {
          return "NO";
        }
      }
    }

    if (!queue.isEmpty()) {
      return "NO";
    }
    return answer;
  }

  /**
   * 8. 응급실
   * @param n
   * @param m
   * @param arr
   * @return
   */
  public static int emergencyRoom(int n, int m, int []arr){
    int answer = 0;
    Queue<Person> queue = new LinkedList<>();

    for(int i=0;i<arr.length;i++){
      queue.offer(new Person(i, arr[i]));
    }

    while(!queue.isEmpty()){
      Person person = queue.poll();

      for(Person element : queue){
        if (person.priority < element.priority) {
          queue.offer(person);
          person = null;
          break;
        }
      }

      if (person != null) {
        answer++;
        if (person.id == m) {
          return answer;
        }
      }

    }
    return answer;
  }

  static class Person{
    int id;
    int priority;

    public Person(int id, int priority) {
      this.id=id;
      this.priority = priority;
    }
  }


  

}