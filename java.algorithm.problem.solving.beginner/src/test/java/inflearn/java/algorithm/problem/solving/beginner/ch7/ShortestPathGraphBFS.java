package inflearn.java.algorithm.problem.solving.beginner.ch7;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class ShortestPathGraphBFS {

  static int n;
  static int m;

  static int[][] arr;

  static List<List<Integer>> list;

  static int[] ch;

  static int[] dis;


  static void BFS() {
    Queue<Integer> queue = new LinkedList<>();

    int L = 0;

    for (int k = 1; k <= n; k++) {
      L = 0;
      ch = new int[n + 1];
      ch[1] = 1;
      queue.offer(1);
      while (!queue.isEmpty()) {
        int len = queue.size();

        for (int i = 0; i < len; i++) {
          Integer p = queue.poll();

          if (p == k) {
            System.out.println("Node-" + k + ": " + L);
          }

          for (Integer nn : list.get(p)) {
            if (ch[nn] == 0) {
              ch[nn] = 1;
              queue.offer(nn);
            }
          }
        }
        L++;
      }
    }
  }

  public static void main(String[] args) {
    n = 6;
    m = 9;

    arr = new int[7][9];
    arr[1][3] = 1;
    arr[1][4] = 1;
    arr[2][1] = 1;
    arr[2][5] = 1;
    arr[3][4] = 1;
    arr[4][5] = 1;
    arr[4][6] = 1;
    arr[6][2] = 1;
    arr[6][5] = 1;

    list = new ArrayList<>();
    for (int i = 0; i <= n; i++) {
      list.add(new ArrayList<>());
    }

    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr[i].length; j++) {
        if (arr[i][j] == 1) {
          list.get(i).add(j);
        }
      }
    }
    ch = new int[n + 1];
    dis = new int[n + 1];

    ch[1] = 1;
    BFS();
  }
}
