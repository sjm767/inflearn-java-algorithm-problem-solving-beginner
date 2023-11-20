package inflearn.java.algorithm.problem.solving.beginner.ch6;

import java.util.Arrays;

/**
 * 9. 뮤직비디오 (결정 알고리즘)
 */
public class MusicVideo {

  static int solution(int n,int m,int[] arr) {
    int answer = Integer.MAX_VALUE;
    int lt = Arrays.stream(arr).max().getAsInt();
    int rt = Arrays.stream(arr).sum();

    while(lt<=rt){
      int mid = (lt+rt)/2;

      int ct = 1;
      int sum = 0;
      for (int i = 0; i < n; i++) {
        if(sum+arr[i] > mid){
          ct++;
          sum=0;
        }
        sum+=arr[i];
      }
      if(ct <= m){
        answer = mid;
        rt = mid - 1;
      } else{
        lt = mid + 1;
      }
    }

    return answer;
  }
  public static void main(String[] args) {
//    int n = 9;
//    int m = 3;
//    int[] arr = {1,2,3,4,5,6,7,8,9};

    int n = 5;
    int m = 4;
    int[] arr = {1,1,1,1,1};

    System.out.println(solution(n, m, arr));

  }
}
