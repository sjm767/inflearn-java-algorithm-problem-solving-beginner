package inflearn.java.algorithm.problem.solving.beginner;

import java.util.*;


public class Main {

  static class Point{
    int x;
    int y;

    public Point(int x, int y) {
      this.x = x;
      this.y = y;
    }
  }

  static int[][] m;
  static int[] dx = {0,1,0,-1};
  static int[] dy = {-1,0,1,0};

  static int[][] dis;

  static int answer = Integer.MAX_VALUE;
  static int ct;

  static int BFS(){
    Queue<Point> queue = new LinkedList<>();

    ct = 0;
    m[1][1] = 1;
    queue.offer(new Point(1, 1));


    while (!queue.isEmpty()) {
      Point poll = queue.poll();

      if(poll.x ==7  && poll.y == 7) {
        return dis[poll.x][poll.y];
      }

      for (int i = 0; i < 4; i++) {
        int nx = poll.x + dx[i];
        int ny = poll.y + dy[i];
        if(nx > 0 && ny > 0 && nx <= 7 && ny <= 7 && m[nx][ny] == 0){
          m[nx][ny] = 1;
          dis[nx][ny] = dis[poll.x][poll.y] + 1;
          queue.add(new Point(nx, ny));
        }
      }

    }

    return -1;

  }

  public static void main(String[] args) {
    Scanner kb = new Scanner(System.in);

    m = new int[8][8];
    dis = new int[8][8];

    for (int i = 1; i <= 7; i++) {
      for (int j = 1; j <= 7; j++) {
        m[i][j] = kb.nextInt();
      }
    }
    System.out.println(BFS());

  }
}
