package inflearn.java.algorithm.problem.solving.beginner.ch6;

import java.util.Arrays;

/**
 * 10. 마구간 정하기 (결정알고리즘)
 */
public class HorseHouse {

  static int solution(int n, int c, int[] arr) {
    int answer = 0;
    Arrays.sort(arr);

    int lt = Arrays.stream(arr).min().getAsInt();
    int rt = Arrays.stream(arr).max().getAsInt();

    while(lt<=rt){
      int mid = (lt+rt)/2;

      int ct = 1;
      int dis = 0;
      for (int i = 1; i < n; i++) {
        if(arr[i] - arr[dis] >= mid){
          ct++;
          dis = i;
        }
      }

      if(ct >= c){
        answer = mid;
        lt=mid+1;
      }else if(ct < c){
        rt = mid-1;
      }
    }
    return answer;
  }

  public static void main(String[] args) {
    int n = 5;
    int c = 3;
    int[] arr = {1, 2, 8, 4, 9};

    System.out.println(solution(n, c, arr));
  }
}
