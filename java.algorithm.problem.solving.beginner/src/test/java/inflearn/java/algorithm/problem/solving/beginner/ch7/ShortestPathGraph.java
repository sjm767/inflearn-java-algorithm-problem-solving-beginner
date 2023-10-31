package inflearn.java.algorithm.problem.solving.beginner.ch7;

import java.util.ArrayList;
import java.util.List;

/**
 * 14. 그래프 최단거리 (BFS)
 */
public class ShortestPathGraph {

  //정점의 수
  static int n;
  //간선의 수
  static int m;
  static int [][]arr;

  static List<List<Integer>> list = new ArrayList<>();

  static int []dis;

  static int []ch;

  static void BFS(int L){


  }

  public static void main(String[] args) {
    n=6;
    m=9;
    dis = new int[n];
    ch = new int[n+1];
    arr = new int[][]{
        {1,3},
        {1,4},
        {2,1},
        {2,5},
        {3,4},
        {4,5},
        {4,6},
        {6,2},
        {6,5}
    };

    for(int i=0;i<=n;i++){
      list.add(new ArrayList<>());
    }

    for(int i=0;i<m;i++){
      int x = arr[i][0];
      int y = arr[i][1];
      List<Integer> innerList = list.get(x);
      innerList.add(y);
    }
    ch[1] = 1;
    BFS(1);


  }
}
