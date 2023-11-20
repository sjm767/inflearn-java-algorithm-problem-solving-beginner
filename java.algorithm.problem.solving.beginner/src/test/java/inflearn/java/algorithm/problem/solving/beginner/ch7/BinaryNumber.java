package inflearn.java.algorithm.problem.solving.beginner.ch7;

/**
 * 2. 이진수 출력 (재귀)
 */
public class BinaryNumber {

  static void solution(int n){
    if(n==0){
      return;
    }
    solution(n/2);
    System.out.print(n%2);
  }
  public static void main(String[] args) {
    int n = 11;
    solution(n);
  }
}
