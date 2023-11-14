package inflearn.java.algorithm.problem.solving.beginner.ch2;

/**
 * 9. 격자판 최대합
 */
public class BoardMaxSum {

  static int solution(int n, int[][] arr) {
    int answer = 0;
    int horiSum = 0;
    int vertiSum=0;
    int max = Integer.MIN_VALUE;

    for(int i=0;i<n;i++){
      for(int j=0;j<n;j++){
        horiSum+=arr[i][j];
        vertiSum += arr[j][i];
      }

      max = Math.max(horiSum,max);
      max = Math.max(vertiSum, max);

      horiSum=0;
      vertiSum=0;
    }

    horiSum=0;
    vertiSum=0;

    for(int i=0;i<n;i++){
      horiSum+=arr[i][i];
      vertiSum+=arr[i][n-i-1];
    }

    max = Math.max(horiSum,max);
    max = Math.max(vertiSum, max);

    answer = max;
    return answer;
  }

  public static void main(String[] args) {
    int n =5;
    int [][]arr={{10,13,10,12,15},{12,39,30,23,11},{11,25,50,53,15},{19,27,29,37,27},{19,13,30,13,19}};

    System.out.println(solution(n, arr));
  }
}
