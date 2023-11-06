package inflearn.java.algorithm.problem.solving.beginner.ch8;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

/**
 * 12. 토마토 (BFS 활용)
 */
public class Tomato {

  static class Point {

    int x;
    int y;

    public Point(int x, int y) {
      this.x = x;
      this.y = y;
    }
  }

  static int m;
  static int n;

  //1: 익음. 0: 익지않음. -1: 토마토가 없음.
  static int[][] t;

  static int [][] dis;

  static int[] dx = {0, 1, 0, -1};
  static int[] dy = {-1, 0, 1, 0};

  static int BFS() {
    Queue<Point> queue = new LinkedList<>();
    int day = -1;

    for (int i = 0; i < m; i++) {
      for (int j = 0; j < n; j++) {
        if (t[i][j] == 1) {
          queue.offer(new Point(i, j));
        }
      }
    }

    while (!queue.isEmpty()) {
        Point p = queue.poll();
        for (int i = 0; i < 4; i++) {
          int nx = p.x + dx[i];
          int ny = p.y + dy[i];
          if ((nx >= 0 && nx <= m - 1) && (ny >= 0 && ny <= n - 1) && t[nx][ny] == 0) {
            t[nx][ny] = 1;
            queue.offer(new Point(nx, ny));
            dis[nx][ny] = dis[p.x][p.y]+1;
          }
        }
    }

    for (int i = 0; i < m; i++) {
      for (int j = 0; j < n; j++) {
        if (t[i][j] == 0) {
          return -1;
        }
      }
    }

    return Arrays.stream(dis)
        .flatMapToInt(Arrays::stream)
        .max().getAsInt();

  }

  public static void main(String[] args) {
    m = 4;
    n = 6;
    t = new int[][]{
        {0, 0, -1, 0, 0, 0},
        {0, 0, 1, 0, -1, 0},
        {0, 0, -1, 0, 0, 0},
        {0, 0, 0, 0, -1, 1}
    };
    dis = new int[m][n];

    System.out.println(BFS());
  }

}
