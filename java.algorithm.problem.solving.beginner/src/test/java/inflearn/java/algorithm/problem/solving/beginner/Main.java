package inflearn.java.algorithm.problem.solving.beginner;

import java.util.*;

public class Main {

  static void solution(int n,int[] a,int[] b){
    List<Character> list = new ArrayList<>();

    for(int i=0;i<n;i++){
      int aa = a[i];
      int bb = b[i];

      if(aa == bb){
        list.add('D');
      }
      else if((aa == 1 && bb == 3) ||(aa == 2 && bb == 1) || (aa == 3 && bb == 2)){
        list.add('A');
      }
      else{
        list.add('B');
      }
    }

    for (Character rslt : list) {
      System.out.println(rslt);
    }

  }

  public static void main(String[] args) {
    Scanner kb = new Scanner(System.in);
    int n = kb.nextInt();
    int[] a = new int[n];
    int[] b = new int[n];

    for(int i=0;i<n;i++){
      a[i] = kb.nextInt();
    }
    for(int i=0;i<n;i++){
      b[i] = kb.nextInt();
    }
    solution(n, a, b);
  }
}
