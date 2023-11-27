package inflearn.java.algorithm.problem.solving.beginner.ch7;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 8. 송아지 찾기 (BFS)
 */
public class FindCalf {

  static int s;
  static int e;

  static int answer = Integer.MAX_VALUE;
  static int[] jump = {1, -1, 5};

  static int[] ch;

  static void BFS() {
    Queue<Integer> queue = new LinkedList<>();

    queue.offer(s);
    ch[s] = 1;
    int L = 0;
    while (!queue.isEmpty()) {
      int len = queue.size();
      for(int i=0;i<len;i++){
        Integer poll = queue.poll();
        ch[poll] = 1;

        if (poll == e) {
          answer = Math.min(answer, L);
          break;
        }
        for (int j = 0; j < 3; j++) {
          int sum = poll+jump[j];
          if(sum > 0 && ch[sum] == 0){
            queue.offer(poll + jump[j]);
          }
        }
      }

      if (answer != Integer.MAX_VALUE) {
        break;
      }
      L++;
    }

  }

  public static void main(String[] args) {
    s = 1;
    e = 21;

    ch =new int[10001];

    BFS();
    System.out.println(answer);
  }
}
