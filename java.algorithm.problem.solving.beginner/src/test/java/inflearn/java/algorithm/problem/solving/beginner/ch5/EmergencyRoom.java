package inflearn.java.algorithm.problem.solving.beginner.ch5;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 8. 응급실
 */
public class EmergencyRoom {

  static class Person{
    int order;
    int priority;

    public Person(int order, int priority) {
      this.order = order;
      this.priority = priority;
    }
  }

  static int solution(int n,int m,int[] arr){
    int answer = 0;
    Queue<Person> queue = new LinkedList<>();

    for (int i=0;i<n;i++) {
      queue.offer(new Person(i,arr[i]));
    }


    int ct = 1;
    while (!queue.isEmpty()) {
      Person person = queue.poll();

      boolean isTop = true;
      for (Person p : queue) {
        if (person.priority < p.priority) {
          isTop = false;
          break;
        }
      }

      if(isTop){
        if(person.order == m){
          answer = ct;
          break;
        }
        ct++;
      }else{
        queue.offer(person);
      }
    }
    return answer;
  }

  public static void main(String[] args) {
    int n = 6;
    int m = 3;
    int[] arr = {70,60,90,60,60,60};

    System.out.println(solution(n, m, arr));
  }
}
