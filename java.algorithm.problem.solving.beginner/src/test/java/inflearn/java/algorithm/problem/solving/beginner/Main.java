package inflearn.java.algorithm.problem.solving.beginner;

import java.util.*;

public class Main {
  public static int[] solution(int n, int k, int[] arr){
    List<Integer> answer = new ArrayList<>();

    int lt=0,rt=0;
    Map<Integer,Integer> map = new HashMap<>();

    for(rt=0;rt<k;rt++){
      map.put(arr[rt],map.getOrDefault(arr[rt],0)+1);
    }
    answer.add(map.size());

    while(rt<n){
      map.put(arr[lt],map.get(arr[lt])-1);
      if(map.get(arr[lt]) <= 0){
        map.remove(arr[lt]);
      }
      map.put(arr[rt],map.getOrDefault(arr[rt],0)+1);
      lt++;
      rt++;

      answer.add(map.size());
    }
    return answer.stream().mapToInt(Integer::intValue).toArray();
  }
  public static void main(String[] args) {
    Scanner kb = new Scanner(System.in);

    int n = kb.nextInt();
    int k = kb.nextInt();
    int[] arr = new int[n];
    for(int i=0;i<n;i++){
      arr[i] = kb.nextInt();
    }

    int[] result = solution(n, k, arr);
    for (int num : result) {
      System.out.print(num+" ");
    }
  }

}
