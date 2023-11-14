package inflearn.java.algorithm.problem.solving.beginner.ch2;

import java.util.ArrayList;
import java.util.List;

/**
 * 6. 뒤집은 소수
 */
public class ReversePrime {

  static List<Integer> solution(int n, int[] arr) {
    List<Integer> revs = new ArrayList<>();
    List<Integer> answer = new ArrayList<>();

    int rev = 0;

    for (int c : arr) {
      while(c>0){
        int t = c%10;
        rev = rev*10 +t;
        c=c/10;
      }

      revs.add(rev);

      rev=0;
    }

    for (int c : revs) {
      if(c<2){
        continue;
      }

      int st = 2;
      int ct = 0;

      while(st < c){
        if(c%st == 0){
          ct++;
        }
        st++;
      }

      if(ct == 0){
        answer.add(c);
      }
    }

    return answer;
  }

  public static void main(String[] args) {
    int n = 9;
    int[] arr = new int[]{8851,1210};

    List<Integer> answer = solution(n, arr);

    for (int a : answer) {
      System.out.print(a+" ");
    }
  }
}
