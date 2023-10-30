package inflearn.java.algorithm.problem.solving.beginner.ch7;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 8. 송아지 찾기1
 */
public class FindCalf {

  static int s;
  static int e;

  static int[] mv = {1,-1,5};
  static int[] ch;
  public static int BFS(int L){
    Queue<Integer> queue = new LinkedList<>();
    ch = new int[10001];
    ch[s]=1;
    queue.offer(s);
    while (!queue.isEmpty()) {
      int len = queue.size();
      for (int i = 0; i < len; i++) {
        Integer pos = queue.poll();
        if (pos == e) {
          return L;
        }

        for (int j = 0; j < mv.length; j++) {
          int nx = pos+mv[j];
          if(nx >= 1 && nx <= 10000 && ch[nx] == 0){
            ch[nx]=1;
            queue.offer(nx);
          }
        }
      }
      L++;
    }
    return -1;
  }
  public static void main(String[] args) {
    s = 5;
    e = 14;



    int answer = BFS(0);
    System.out.println(answer);
  }
}
