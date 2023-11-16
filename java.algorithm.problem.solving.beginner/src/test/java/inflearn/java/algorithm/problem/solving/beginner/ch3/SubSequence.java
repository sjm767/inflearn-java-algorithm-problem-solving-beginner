package inflearn.java.algorithm.problem.solving.beginner.ch3;

/**
 * 4. 연속 부분수열
 */
public class SubSequence {

  static int solution(int n,int m,int[] arr) {
    int answer = 0;

    int lt = 0;
    int sum = 0;

    for(int rt=0;rt<n;rt++){
      sum+=arr[rt];
      if(sum == m) {
        answer++;
      }
      else if(sum > m){
        while(sum >m){
          sum-=arr[lt];
          lt++;
          if(sum==m){
            answer++;
          }
        }
      }

    }
    return answer;
  }

  public static void main(String[] args) {
    int n = 8;
    int m = 6;
    int[] arr = {1,2,1,3,1,1,1,2};

    System.out.println(solution(n, m, arr));
  }
}
