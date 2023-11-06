package inflearn.java.algorithm.problem.solving.beginner.ch8;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 13. 섬나라 아일랜드
 */
public class IslandNation {

  static class Point {

    int x;
    int y;

    public Point(int x, int y) {
      this.x = x;
      this.y = y;
    }
  }

  static int n;
  static int[][] board;

  static int ct=0;

  static int[] dx = {0,1,1,1,0,-1,-1,-1};
  static int[] dy = {-1,-1,0,1,1,1,0,-1};

  static int BFS(){
    Queue<Point> queue = new LinkedList<>();

      for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
          if (board[i][j] == 1) {
            queue.offer(new Point(i, j));

            while (!queue.isEmpty()) {
              Point p = queue.poll();
              for (int k = 0; k < 8; k++) {
                int nx = p.x + dx[k];
                int ny = p.y + dy[k];
                if ((nx >= 0 && nx < n) && (ny >= 0 && ny < n) && (board[nx][ny] == 1)) {
                  board[nx][ny] = 0;
                  queue.offer(new Point(nx, ny));
                }
              }
            }
            ct++;
          }
        }
      }

    return ct;
  }

  public static void main(String[] args) {
    n=7;
    board = new int[][]{
        {1,1,0,0,0,1,0},
        {0,1,1,0,1,1,0},
        {0,1,0,0,0,0,0},
        {0,0,0,1,0,1,1},
        {1,1,0,1,1,0,0},
        {1,0,0,0,1,0,0},
        {1,0,1,0,1,0,0}
    };

    System.out.println(BFS());

  }

}
