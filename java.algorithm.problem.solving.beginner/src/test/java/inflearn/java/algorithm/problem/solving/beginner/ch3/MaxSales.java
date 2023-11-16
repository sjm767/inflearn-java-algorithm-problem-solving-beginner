package inflearn.java.algorithm.problem.solving.beginner.ch3;

/**
 * 3. 최대 매출
 */
public class MaxSales {

  static int solution(int n,int k, int[] arr) {
    int sum = 0;
    int max = Integer.MIN_VALUE;

    for (int i = 0; i < k; i++) {
      sum+=arr[i];
    }
    max = Math.max(max, sum);

    for(int i=k;i<n;i++){
      sum += (arr[i] - arr[i - k]);
      max = Math.max(max, sum);
    }

    return max;
  }
  public static void main(String[] args) {

    int n = 10;
    int k = 3;
    int[] arr = {12,15,11,20,25,10,20,19,13,15};

    System.out.println(solution(n, k, arr));


  }
}
