package inflearn.java.algorithm.problem.solving.beginner.ch7;

import java.util.ArrayList;
import java.util.List;

/**
 * 13. 경로탐색 (인접리스트, ArrayList)
 */
public class PathSearchWithList {

  static int n;
  static int m;

  static int[] ch;
  static List<List<Integer>> list;

  static int answer = 0;

  static void DFS(int V){
    if(V==n){
      answer++;
    }else{
      for (Integer aa : list.get(V)) {
        if(ch[aa] == 0){
          ch[aa] = 1;
          DFS(aa);
          ch[aa] = 0;
        }
      }
    }

  }
  public static void main(String[] args) {
    n = 5;
    m = 9;
    ch = new int[n + 1];

    list = new ArrayList<>();
    for(int i=0;i<=n;i++){
      list.add(new ArrayList<>());
    }


    int[][] graph = new int[n+1][n+1];
    graph[1][2] = 1;
    graph[1][3] = 1;
    graph[1][4] = 1;
    graph[2][1] = 1;
    graph[2][3] = 1;
    graph[2][5] = 1;
    graph[3][4] = 1;
    graph[4][2] = 1;
    graph[4][5] = 1;


    for(int i=1;i<=n;i++){
      List<Integer> iList = list.get(i);
      for (int j = 1; j <= n; j++) {
        if(graph[i][j] == 1){
          iList.add(j);
        }
      }
    }

    ch[1] = 1;
    DFS(1);

    System.out.println(answer);

  }
}
