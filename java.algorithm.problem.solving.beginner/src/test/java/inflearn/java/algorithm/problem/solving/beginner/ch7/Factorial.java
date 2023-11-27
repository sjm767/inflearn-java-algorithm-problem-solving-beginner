package inflearn.java.algorithm.problem.solving.beginner.ch7;

/**
 * 3. 팩토리얼
 */
public class Factorial {

  static int DFS(int n){
    if(n==1 || n==0){
      return 1;
    }
    return n*DFS(n-1);
  }
  public static void main(String[] args) {
    int n = 5;

    System.out.println(DFS(n));
  }
}
