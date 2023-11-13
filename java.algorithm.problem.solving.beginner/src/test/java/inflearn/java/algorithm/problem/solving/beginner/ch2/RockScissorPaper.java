package inflearn.java.algorithm.problem.solving.beginner.ch2;

import java.util.ArrayList;
import java.util.List;

/**
 * 3. 가위 바위 보
 */
public class RockScissorPaper {

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
    int n = 5;
    int[] a = {2,3,3,1,3};
    int[] b = {1,1,2,2,3};

    solution(n, a, b);
  }
}
