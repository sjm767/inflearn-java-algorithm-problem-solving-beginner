package inflearn.java.algorithm.problem.solving.beginner.ch5;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 6. 공주구하기
 */
public class SavePrincess {

  static int solution(int n,int k){
    Queue<Integer> queue = new LinkedList<>();

    for(int i=1;i<=n;i++){
      queue.add(i);
    }

    int ct =0;
    while(queue.size() > 1){
      ct++;
      Integer p = queue.poll();
      if(ct % k != 0){
        queue.add(p);
      }
    }

    return queue.poll();
  }
  public static void main(String[] args) {
    int n = 8;
    int k = 3;

    System.out.println(solution(n, k));
  }
}
