package inflearn.java.algorithm.problem.solving.beginner.ch7;

import java.util.ArrayList;
import java.util.List;

/**
 * 13. 경로탐색 (인접리스트, ArrayList)
 */
public class PathSearchWithList {

  static int n;
  static int m;
  static int [][]arr;
  static int [][]graph;
  static int[]ch;
  static int answer=0;
  static List<List<Integer>> list = new ArrayList<>();

  static void DFS(int x){
    if(x == n){
      answer++;
    }
    else{
      List<Integer> list1 = list.get(x);
      for (Integer v : list1){
        if(ch[v] == 0){
          ch[v]=1;
          DFS(v);
          ch[v]=0;
        }
      }
    }

  }
  public static void main(String[] args) {
    n=5;
    m=9;
    graph=new int[n+1][n+1];
    arr= new int[][]{
        {1, 2},
        {1, 3},
        {1, 4},
        {2, 1},
        {2, 3},
        {2, 5},
        {3, 4},
        {4, 2},
        {4, 5}
    };
    ch = new int[n+1];

    for(int i=0;i<=n;i++){
      list.add(new ArrayList<>());
    }


    for(int i=0;i<m;i++){
      int x = arr[i][0];
      int y = arr[i][1];
      List<Integer> innerList = list.get(x);
      innerList.add(y);
    }

    ch[1]=1;
    DFS(1);
    System.out.println(answer);
  }
}
