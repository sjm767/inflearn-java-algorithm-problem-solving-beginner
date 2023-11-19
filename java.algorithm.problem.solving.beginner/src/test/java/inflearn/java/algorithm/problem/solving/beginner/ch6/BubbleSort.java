package inflearn.java.algorithm.problem.solving.beginner.ch6;

/**
 * 2. 버블 정렬
 */
public class BubbleSort {

  static int[] solution(int n,int[] arr){

    for(int i=0;i<n;i++){
      for(int j=0;j<n-1-i;j++){
        if(arr[j] > arr[j+1]){
          int tmp = arr[j];
          arr[j] = arr[j+1];
          arr[j+1] = tmp;
        }
      }

    }

    return arr;
  }
  public static void main(String[] args) {
    int n = 6;
    int[] arr = {13, 5, 11, 7, 23, 15};

    int[] answer = solution(n, arr);
    for (int a : answer) {
      System.out.print(a+" ");
    }
  }
}
