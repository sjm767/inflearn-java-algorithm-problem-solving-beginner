package inflearn.java.algorithm.problem.solving.beginner.ch8;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

/**
 * 14. 피자 배달 거리
 */
public class PizzaDelivery {

  static class Point{
    int x;
    int y;

    public Point(int x, int y) {
      this.x = x;
      this.y = y;
    }
  }

  static int n;
  static int m;
  static int[][] city;

  static void BFS(){
    Queue<Point> queue = new LinkedList<>();
    Map<Point, Integer> map = new HashMap<>();

    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        if (city[i][j] == 2) {
          queue.offer(new Point(i, j));
        }
      }
    }

    while (!queue.isEmpty()) {
      Point p = queue.poll();
      int sum =0;
      for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
          if(city[i][j] == 1){
            int disX = Math.abs((i+1)-(p.x+1));
            int disY = Math.abs((j+1)-(p.y+1));
            int ss = (disX + disY);
            sum+=ss;
          }
        }
      }
      map.put(p, sum);
    }

    int a=4;

  }

  public static void main(String[] args) {
    n=4;
    m=4;

    city = new int[][]{
        {0,1,2,0},
        {1,0,2,1},
        {0,2,1,2},
        {2,0,1,2}
    };

    BFS();

  }

}
