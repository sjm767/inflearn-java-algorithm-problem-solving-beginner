package inflearn.java.algorithm.problem.solving.beginner.ch10;

/**
 * 2. 돌다리 건너기
 */
public class StoneBridge {


  static int solution(int n) {
    int[] dy = new int[n+2];

    dy[1] = 1;
    dy[2] = 2;

    for(int i=3;i<=n+1;i++){
      dy[i] = dy[i-2] + dy[i-1];
    }

    return dy[n+1];
  }
  public static void main(String[] args) {
    int n = 7;
    System.out.println(solution(n));
  }

}
