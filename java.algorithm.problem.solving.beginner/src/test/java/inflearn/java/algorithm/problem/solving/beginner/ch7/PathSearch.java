package inflearn.java.algorithm.problem.solving.beginner.ch7;

/**
 * 12. 경로 탐색
 */
public class PathSearch {

  static int n;
  static int m;
  static int[][] graph;

  static int[] ch;
  static int answer = 0;
  static void DFS(int V){
    if(V==n){
      answer++;
    }else{
      for(int i=1;i<=n;i++){
        if(graph[V][i] == 1 && ch[i] != 1){
          ch[V+1] = 1;
          DFS(V+1);
          ch[V+1] = 0;
        }
      }
    }
  }
  public static void main(String[] args) {
    n = 5;
    m = 9;

    ch = new int[n+1];
    ch[1] = 1;

    graph = new int[n+1][n+1];
    graph[1][2] = 1;
    graph[1][3] = 1;
    graph[1][4] = 1;
    graph[2][1] = 1;
    graph[2][3] = 1;
    graph[2][5] = 1;
    graph[3][4] = 1;
    graph[4][2] = 1;
    graph[4][5] = 1;

    DFS(1);
    System.out.println(answer);
  }
}
