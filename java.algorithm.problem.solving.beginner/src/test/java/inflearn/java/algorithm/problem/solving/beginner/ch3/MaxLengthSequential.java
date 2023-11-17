package inflearn.java.algorithm.problem.solving.beginner.ch3;

/**
 * 6. 최대 길이 연속부분수열
 */
public class MaxLengthSequential {

  static int solution(int n,int k,int[] arr) {
    int max = Integer.MIN_VALUE;
    int length = 0;
    int lt = 0;
    int rt = 0;

    while(rt<n) {
      if(arr[rt] == 1){
        length++;
        rt++;
      }else if(arr[rt] == 0){
        if(k>0){
          k--;
          length++;
          rt++;
        }else{
          while(k == 0){
            if(arr[lt] == 0){
              k++;
            }
            length--;
            lt++;
          }
        }
      }
      max = Math.max(max, length);
    }

    return max;
  }

  public static void main(String[] args) {
    int n = 20;
    int k = 2;
    int[] arr = {1,0,1,1,1,1,1,0,1,0,1,1,1,1,1,0,1,1,0,1};

    System.out.println(solution(n, k, arr));
  }

}
