package inflearn.java.algorithm.problem.solving.beginner.ch7;

/**
 * 4. 피보나치 재귀 (메모이제이션)
 */
public class FibonacciRecursive {

  static int[] mem;
  static int DFS(int n){
    if(mem[n] != 0){
      return mem[n];
    }

    if(n==1 || n ==2){
      return mem[n] = 1;
    }
    else{
      return mem[n] = DFS(n-2)+DFS(n-1);
    }
  }
  public static void main(String[] args) {
    int n = 45;
    mem = new int[n+1];
    for(int i=1;i<=n;i++){
      System.out.print(DFS(i)+" ");
    }


  }

}
