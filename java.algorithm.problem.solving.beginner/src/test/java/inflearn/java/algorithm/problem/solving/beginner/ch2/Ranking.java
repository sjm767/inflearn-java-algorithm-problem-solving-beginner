package inflearn.java.algorithm.problem.solving.beginner.ch2;

import java.util.ArrayList;
import java.util.List;

/**
 * 8. 등수구하기
 */
public class Ranking {

  static List<Integer> solution(int n,int[] arr) {
    List<Integer> answer = new ArrayList<>();

    for (int stu : arr) {
      int rank = 1;
      for(int i=0;i<n;i++){
        if(stu < arr[i]){
          rank++;
        }
      }
      answer.add(rank);
    }

    return answer;
  }

  public static void main(String[] args) {
    int n=5;
    int[] arr = new int[]{87,89,92,100,76};

    List<Integer> answer = solution(n, arr);
    for (int a : answer) {
      System.out.print(a+" ");
    }

  }
}
