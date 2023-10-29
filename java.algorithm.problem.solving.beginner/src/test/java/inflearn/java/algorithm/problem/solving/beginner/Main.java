package inflearn.java.algorithm.problem.solving.beginner;

import java.util.*;

public class Main {

  private static int stableCount(int[] arr, int distance) {
    int cnt=1;
    int currentIdx = 0;
    for (int i = 1; i < arr.length; i++) {
      if(arr[currentIdx] + distance <= arr[i]){
        cnt++;
        currentIdx = i;
      }
    }

    return cnt;
  }

  public static int solution(int n, int c, int[] arr){
    int answer = 0;

    Arrays.sort(arr);
    int lt = arr[0];
    int rt = Arrays.stream(arr).max().getAsInt();

    while (lt <= rt) {
      int mid = (lt + rt) / 2;

      //배치되면
      if(stableCount(arr,mid) >= c){
        answer = mid;
        lt = mid+1;
      }else{
        rt = mid-1;
      }
    }
    return answer;
  }

  public static void main(String[] args) {
    Scanner kb = new Scanner(System.in);

    int n = kb.nextInt();
    int m = kb.nextInt();
    int[] arr = new int[n];

    for (int i = 0; i < n; i++) {
      arr[i]=kb.nextInt();
    }
    System.out.println(solution(n, m, arr));

  }

}
