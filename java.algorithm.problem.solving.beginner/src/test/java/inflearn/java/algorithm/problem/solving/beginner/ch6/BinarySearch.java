package inflearn.java.algorithm.problem.solving.beginner.ch6;

import java.util.Arrays;

/**
 * 8. 이분 검색
 */
public class BinarySearch {

  static int solution(int n,int m,int[] arr){
    int answer = -1;
    int lt = 0;
    int rt = n-1;

    Arrays.sort(arr);

    while(lt<=rt){
      int mid = (lt+rt)/2;
      if(arr[mid] == m){
        answer = mid+1;
        break;
      }
      else if(arr[mid] > m){
        rt = mid - 1;
      }else if(arr[mid] < m){
        lt = mid + 1;
      }
    }


    return answer;
  }
  public static void main(String[] args) {
    int n = 8;
    int m = 32;
    int[] arr = {23,87,65,12,57,32,99,81};

    System.out.println(solution(n, m, arr));
  }
}