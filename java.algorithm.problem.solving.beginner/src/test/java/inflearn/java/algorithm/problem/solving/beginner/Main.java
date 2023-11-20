package inflearn.java.algorithm.problem.solving.beginner;

import java.util.*;

public class Main {

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
    Scanner kb = new Scanner(System.in);
    int n = kb.nextInt();
    int c = kb.nextInt();
    int[] arr = new int[n];

    for (int i = 0; i < n; i++) {
      arr[i] = kb.nextInt();
    }

    System.out.println(solution(n, c, arr));
  }
}
