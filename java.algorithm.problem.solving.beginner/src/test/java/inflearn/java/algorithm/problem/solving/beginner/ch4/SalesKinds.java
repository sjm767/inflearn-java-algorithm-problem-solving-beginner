package inflearn.java.algorithm.problem.solving.beginner.ch4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

/**
 * 3. 매출액의 종류
 */
public class SalesKinds {

  static List<Integer> solution(int n, int k, int[] arr) {
    List<Integer> answer = new ArrayList<>();

    Map<Integer, Integer> map = new HashMap<>();

    for(int i=0;i<k;i++){
      map.put(arr[i],map.getOrDefault(arr[i],0)+1);
    }
    answer.add(map.size());

    int lt = 0;
    for (int rt = k ; rt < n; rt++) {

      map.put(arr[rt],map.getOrDefault(arr[rt],0)+1);

      if (map.get(arr[lt]) == 1) {
        map.remove(arr[lt]);
      }else{
        map.put(arr[lt], map.get(arr[lt])-1);
      }
      lt++;

      answer.add(map.size());
    }

    return answer;
  }

  public static void main(String[] args) {
    int n = 7;
    int k = 4;
    int[] arr = {20, 12, 20, 10, 23, 17, 10};

    List<Integer> answer = solution(n, k, arr);
    for (Integer a : answer) {
      System.out.print(a + " ");
    }
  }
}
