package inflearn.java.algorithm.problem.solving.beginner.ch8;

public class NumberOfCombinations {

  static int n;
  static int r;

  static int[][] mem;

  static int combi(int n,int r){
    if(mem[n][r] > 0){
      return mem[n][r];
    }
    if(r==0 || n==r){
      return mem[n][r] = 1;
    }
    else{
      return mem[n][r] = combi(n-1,r-1)+combi(n-1,r);
    }
  }
  public static void main(String[] args) {
    n = 33;
    r = 19;
    mem = new int[n+1][n+1];

    System.out.println(combi(n, r));

  }
}
