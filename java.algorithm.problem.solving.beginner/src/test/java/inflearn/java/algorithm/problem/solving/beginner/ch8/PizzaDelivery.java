package inflearn.java.algorithm.problem.solving.beginner.ch8;

import java.util.ArrayList;
import java.util.List;

/**
 * 14. 피자 배달 거리 (DFS 활용)
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
  static int[][] board;

  static int[] dx = {0,1,0,-1};
  static int[] dy = {-1,0,1,0};

  static List<Point> hs = new ArrayList<>();
  static List<Point> pz = new ArrayList<>();

  static int[] combi;

  static int answer = Integer.MAX_VALUE;

  static void DFS(int L, int s){
    if(L == m){
      int sum = 0;
      for (Point h : hs) {
        int dis = Integer.MAX_VALUE;
        for(int i=0;i<m;i++){
          Point pzPoint = pz.get(combi[i]);

          int xSum = Math.abs(h.x - pzPoint.x);
          int ySum = Math.abs(h.y - pzPoint.y);
          dis = Math.min(dis,xSum+ySum);
        }
        sum+=dis;
      }
      answer = Math.min(answer, sum);
    }else{
      for (int i = s; i < pz.size(); i++) {
        combi[L] = i;
        DFS(L+1,i+1);
      }
    }
  }

  static void solution(){
    for(int i=0;i<n;i++){
      for(int j=0;j<n;j++){
        if(board[i][j] == 1){
          hs.add(new Point(i, j));
        }else if(board[i][j] == 2){
          pz.add(new Point(i, j));
        }
      }
    }

    DFS(0,0);
  }

  public static void main(String[] args) {
    n = 4;
    m = 4;
    board = new int[][]{
        {0,1,2,0},
        {1,0,2,1},
        {0,2,1,2},
        {2,0,1,2}
    };
    combi = new int[m];
    solution();
    System.out.println(answer);
  }

}
