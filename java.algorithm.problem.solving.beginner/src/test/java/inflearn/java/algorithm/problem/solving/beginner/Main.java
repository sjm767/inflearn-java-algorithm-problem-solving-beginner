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
  static int[] dx={-1,0,1,0};
  static int[] dy={0,1,0,-1};

  static int[][] dis;


  static void BFS(int x,int y){
    Queue<Point> queue = new LinkedList<>();

    queue.offer(new Point(x, y));
    while (!queue.isEmpty()) {
      Point p = queue.poll();
      m[p.x][p.y] = 1;
      for (int i = 0; i < 4; i++) {
        int nx = p.x + dx[i];
        int ny = p.y + dy[i];
        if ((nx >= 1 && nx <= 7) && (ny >= 1 && ny <= 7) && m[nx][ny] == 0) {
          dis[nx][ny] = dis[p.x][p.y]+1;
          queue.offer(new Point(nx, ny));
        }
      }
    }
    dis[7][7] = dis[7][7] == 0 ? -1 : dis[7][7];
  }

  public static void main(String[] args) {
    Scanner kb = new Scanner(System.in);
    m = new int[8][8];
    dis = new int[8][8];

    for(int i=1;i<=7;i++){
      for (int j = 1; j <= 7; j++) {
        m[i][j] = kb.nextInt();
      }
    }
    m[1][1]=1;
    BFS(1,1);
    System.out.println(dis[7][7]);
  }
}
