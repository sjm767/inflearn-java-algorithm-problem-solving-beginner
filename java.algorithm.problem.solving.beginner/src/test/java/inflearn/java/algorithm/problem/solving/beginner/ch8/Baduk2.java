package inflearn.java.algorithm.problem.solving.beginner.ch8;

/**
 * 2. 바둑이 승차 (DFS)
 */
public class Baduk2 {

  static int c;
  static int n;
  static int[] arr;

  static int answer = 0;
  static void DFS(int L,int sum){
    if(sum>c){
      return;
    }
    if(L==n){
      answer = Math.max(sum, answer);
    }
    else{
      DFS(L+1,sum+arr[L]);
      DFS(L+1,sum);
    }

  }

  public static void main(String[] args) {
    c = 259;
    n = 5;
    arr = new int[]{81, 58, 42, 33, 61};

    DFS(0,0);
    System.out.println(answer);
  }
}
