package inflearn.java.algorithm.problem.solving.beginner.ch10;

/**
 * 5. 동전교환 (냅색 알고리즘)
 */
public class ExchangeCoin {

  static int solution(int n, int[] arr, int m) {
    int answer = 0;
    int[] dy = new int[m+1];

    dy[0] = 0;
    dy[1] = 1;

    for (int i = 2; i <= m; i++) {
      int min= Integer.MAX_VALUE;
      for (int j = 0; j < n; j++) {
        int idx = i-arr[j];
        if(idx >= 0){
          min = Math.min(min, dy[idx] + 1);
        }
      }
      dy[i] = min;
    }

    return dy[m];
  }

  public static void main(String[] args) {
    int n = 3;
    int[] arr = {1, 2, 5};
    int m = 15;

    System.out.println(solution(n, arr, m));
  }

}
