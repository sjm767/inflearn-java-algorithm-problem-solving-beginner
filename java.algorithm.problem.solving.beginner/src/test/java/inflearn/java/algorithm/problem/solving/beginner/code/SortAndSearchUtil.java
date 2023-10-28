package inflearn.java.algorithm.problem.solving.beginner.code;

import java.awt.Point;
import java.util.*;

public class SortAndSearchUtil {

  private SortAndSearchUtil() {

  }

  /**
   * 1. 선택 정렬
   */
  public static int[] selectionSort(int n, int[] arr) {
    int idx;

    for (int i = 0; i < n; i++) {
      idx = i;
      for (int j = i + 1; j < n; j++) {
        if (arr[idx] > arr[j]) {
          idx = j;
        }
      }

      int temp = arr[idx];
      arr[idx] = arr[i];
      arr[i] = temp;
    }
    return arr;
  }

  /**
   * 2. 버블 정렬
   *
   * @param n
   * @param arr
   * @return
   */
  public static int[] bubbleSort(int n, int[] arr) {

    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n - 1; j++) {
        if (arr[j] > arr[j + 1]) {
          int temp = arr[j];
          arr[j] = arr[j + 1];
          arr[j + 1] = temp;
        }
      }
    }
    return arr;
  }

  /**
   * 3. 삽입 정렬
   *
   * @param n
   * @param arr
   * @return
   */
  public static int[] insertionSort(int n, int[] arr) {

    for (int i = 1; i < n; i++) {
      int tmp = arr[i];
      int j;
      for (j = i - 1; j >= 0; j--) {
        if (arr[j] > tmp) {
          arr[j + 1] = arr[j];
        } else {
          break;
        }
      }

      arr[j + 1] = tmp;
    }

    return arr;
  }

  /**
   * 4. Least Recently Used
   *
   * @param s
   * @param n
   * @param arr
   * @return
   */
  public static int[] leastRecentlyUsed(int s, int n, int[] arr) {
    int[] cache = new int[s];
    for (int num : arr) {
      int idx = -1;
      for (int i = 0; i < s; i++) {
        if (cache[i] == num) {
          idx = i;
          break;
        }
      }

      //캐싱된게 없으면
      if (idx == -1) {
        for (int i = s - 1; i >= 1; i--) {
          cache[i] = cache[i - 1];
        }
      } else {
        for (int i = idx; i >= 1; i--) {
          cache[i] = cache[i - 1];
        }
      }
      cache[0] = num;
    }

    return cache;
  }

  /**
   * 5. 중복 확인
   * @param n
   * @param arr
   * @return
   */
  public static String checkDuplicate(int n,int []arr){
    String answer = "U";

    Map<Integer, Integer> map = new HashMap<>();


    for (int num : arr) {
      if(map.get(num) == null){
        map.put(num,map.getOrDefault(num,0) + 1);
      }else{
        return "D";
      }
    }
    return answer;
  }

  /**
   * 6. 장난꾸러기
   * @param n
   * @param arr
   * @return
   */
  public static int[] prankster(int n,int []arr){
    List<Integer> answer = new ArrayList<>();
    int[] copy = arr.clone();
    Arrays.sort(arr);

    for (int i=0;i<n;i++) {
      if(arr[i] != copy[i]){
        answer.add(i+1);
      }
    }

    return answer.stream()
        .mapToInt(Integer::intValue)
        .toArray();
  }

  /**
   * 7. 좌표 정렬
   * @param n
   * @param points
   * @return
   */
  public static List<Point> compareTo(int n, List<Point> points){
    Collections.sort(points);
    return points;
  }


  public static class Point implements Comparable<Point>{
    public int x;
    public int y;

    public Point(int x, int y) {
      this.x = x;
      this.y = y;
    }

    @Override
    public int compareTo(Point o) {
      if (this.x == o.x) {
        return this.y - o.y;
      }
      return this.x-o.x;
    }

    @Override
    public boolean equals(Object obj) {
      Point target = null;
      if(obj instanceof Point){
        target = (Point) obj;
      }

      return this.x == target.x && this.y == target.y;
    }
  }
}
