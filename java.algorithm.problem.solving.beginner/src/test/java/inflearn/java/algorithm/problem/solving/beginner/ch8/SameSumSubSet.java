package inflearn.java.algorithm.problem.solving.beginner.ch8;

/**
 * 1. 합이 같은 부분집합 (DFS : 아마존 인터뷰)
 */
public class SameSumSubSet {

  static int n;
  static int[] arr;
  static int totalSum=0;

  static String answer = "NO";
  static void DFS(int L, int sum){
    if(L==n || answer.equals("YES") || sum>totalSum/2){
      return;
    }
    if(totalSum - sum == sum){
      answer = "YES";
    }
    else{
      DFS(L+1,arr[L]+sum);
      DFS(L+1, sum);
    }
  }

  public static void main(String[] args) {
    n = 6;
    arr = new int[]{1,3,5,6,7,10};
    for (int e : arr) {
      totalSum+=e;
    }

    DFS(0,0);
    System.out.println(answer);
  }
}
