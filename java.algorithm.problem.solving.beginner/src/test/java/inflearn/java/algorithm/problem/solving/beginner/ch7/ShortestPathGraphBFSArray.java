package inflearn.java.algorithm.problem.solving.beginner.ch7;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * 14. 그래프 최단거리 (BFS)
 */
public class ShortestPathGraphBFSArray {

  //정점의 수
  static int n;
  //간선의 수
  static int m;
  static int [][]arr;

  static List<List<Integer>> list = new ArrayList<>();

  static int []dis;

  static int []ch;

  static void BFS(int v){
    Queue<Integer> queue = new LinkedList<>();

    ch[v] = 1;
    dis[v] = 0;
    queue.offer(v);

    while (!queue.isEmpty()) {
      Integer nv = queue.poll();
      for(Integer nn : list.get(nv)){
        if(ch[nn]==0){
          dis[nn] = dis[nv] +1;
          ch[nn] = 1;
          queue.offer(nn);
        }
      }

    }
  }

  public static void main(String[] args) {
    n=6;
    m=9;
    dis = new int[n+1];
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

    BFS(1);
    int a=4;

  }
}
