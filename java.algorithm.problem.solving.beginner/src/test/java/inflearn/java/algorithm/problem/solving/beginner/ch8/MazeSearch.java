package inflearn.java.algorithm.problem.solving.beginner.ch8;

/**
 * 10. 미로 탐색 (DFS)
 */
public class MazeSearch {
  static int[][] m;

  static int[] dx={-1,0,1,0};
  static int[] dy={0,1,0,-1};

  static int answer = 0;

  static void DFS(int x,int y){

    if(x==7 && y == 7){
      answer++;
    }else{
      for(int i=0;i<4;i++){
        int nx = x+dx[i];
        int ny = y+dy[i];
        if((nx>0 && nx<8) && (ny>0 && ny<8) && m[nx][ny] == 0){
          m[x][y] = 1;
          DFS(nx,ny);
          m[x][y] = 0;
        }
      }
    }

  }

  public static void main(String[] args) {
    m = new int[][] {
        {0,0,0,0,0,0,0,0},
        {0,0,0,0,0,0,0,0},
        {0,0,1,1,1,1,1,0},
        {0,0,0,0,1,0,0,0},
        {0,1,1,0,1,0,1,1},
        {0,1,1,0,0,0,0,1},
        {0,1,1,0,1,1,0,0},
        {0,1,0,0,0,0,0,0},
    };
    m[1][1]=1;
    DFS(1,1);
    System.out.println(answer);


  }

}
