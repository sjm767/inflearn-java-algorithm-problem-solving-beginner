package inflearn.java.algorithm.problem.solving.beginner.ch7;

/**
 * 13. 경로탐색 (DFS)
 */
public class PathSearch {

  static int n;
  static int m;
  static int [][]arr;
  static int [][]graph;
  static int[]ch;
  static int answer=0;
  public static void DFS(int x){
    if(x==n){
      answer++;
    }
    else{
      for(int i=1;i<=n;i++){
        //갈수 있음
        if(ch[i] == 0 && graph[x][i] == 1){
          ch[i] = 1;
          DFS(i);
          ch[i] = 0;
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

    for(int i=0;i<m;i++){
      int x = arr[i][0];
      int y = arr[i][1];
      graph[x][y] = 1;
    }
    ch[1]=1;
    DFS(1);
  }
}
