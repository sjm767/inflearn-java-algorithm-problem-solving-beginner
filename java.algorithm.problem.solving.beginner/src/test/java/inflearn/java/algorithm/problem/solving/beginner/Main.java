package inflearn.java.algorithm.problem.solving.beginner;

import java.util.*;

public class Main {

  static class Person{
    int id;
    int priority;

    public Person(int id, int priority) {
      this.id=id;
      this.priority = priority;
    }
  }

  public static int solution(int n, int m, int []arr) {
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

  public static void main(String[] args) {
    Scanner kb = new Scanner(System.in);

    int n = kb.nextInt();
    int m = kb.nextInt();
    int []arr = new int[n];
    for(int i=0;i<n;i++){
      arr[i] = kb.nextInt();
    }

    System.out.println(solution(n, m, arr));
  }

}
