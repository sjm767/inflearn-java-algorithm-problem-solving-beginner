package inflearn.java.algorithm.problem.solving.beginner.ch4;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

/**
 * 5. K번째 큰 수
 */
public class LargeKNumber {

  static int solution(int n, int k, int[] arr) {
    int answer = -1;
    Set<Integer> set = new TreeSet<>(Comparator.reverseOrder());


    for (int i = 0; i < n; i++) {
      for (int j = i+1; j < n; j++) {
        for (int kk = j+1; kk < n; kk++) {
          set.add(arr[i]+arr[j]+arr[kk]);
        }
      }
    }

    int ct = 1;
    for (Integer s : set) {
      if(ct == k){
        answer = s;
        break;
      }
      ct++;
    }

    return answer;
  }

  public static void main(String[] args) {
    int n = 10;
    int k = 3;
    int[] arr = {13, 15, 34, 23, 45, 65, 33, 11, 26, 42};

    System.out.println(solution(n, k, arr));


  }
}
