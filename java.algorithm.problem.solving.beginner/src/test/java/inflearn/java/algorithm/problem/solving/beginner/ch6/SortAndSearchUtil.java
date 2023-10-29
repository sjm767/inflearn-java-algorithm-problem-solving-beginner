package inflearn.java.algorithm.problem.solving.beginner.ch6;

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
   *
   * @param n
   * @param arr
   * @return
   */
  public static String checkDuplicate(int n, int[] arr) {
    String answer = "U";

    Map<Integer, Integer> map = new HashMap<>();

    for (int num : arr) {
      if (map.get(num) == null) {
        map.put(num, map.getOrDefault(num, 0) + 1);
      } else {
        return "D";
      }
    }
    return answer;
  }

  /**
   * 6. 장난꾸러기
   *
   * @param n
   * @param arr
   * @return
   */
  public static int[] prankster(int n, int[] arr) {
    List<Integer> answer = new ArrayList<>();
    int[] copy = arr.clone();
    Arrays.sort(arr);

    for (int i = 0; i < n; i++) {
      if (arr[i] != copy[i]) {
        answer.add(i + 1);
      }
    }

    return answer.stream()
        .mapToInt(Integer::intValue)
        .toArray();
  }

  /**
   * 7. 좌표 정렬
   *
   * @param n
   * @param points
   * @return
   */
  public static List<Point> compareTo(int n, List<Point> points) {
    Collections.sort(points);
    return points;
  }


  public static class Point implements Comparable<Point> {

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
      return this.x - o.x;
    }

    @Override
    public boolean equals(Object obj) {
      Point target = null;
      if (obj instanceof Point) {
        target = (Point) obj;
      }

      return this.x == target.x && this.y == target.y;
    }
  }

  /**
   * 8. 이분검색 (이진탐색)
   *
   * @param n
   * @param m
   * @param arr
   * @return
   */
  public static int binarySearch(int n, int m, int[] arr) {
    int answer = -1;

    Arrays.sort(arr);

    int lt = 0;
    int rt = n - 1;
    int mid;

    while (lt <= rt) {
      mid = (lt + rt) / 2;

      if (m == arr[mid]) {
        answer = mid + 1;
        break;
      } else if (m < arr[mid]) {
        rt = mid - 1;
      } else {
        lt = mid + 1;
      }
    }
    return answer;
  }

  /**
   * 9. 뮤직비디오
   *
   * @param n
   * @param m
   * @param arr
   * @return
   */
  public static int musicVideo(int n, int m, int[] arr) {
    int answer = 0;

    int lt = Arrays.stream(arr).max().getAsInt();
    int rt = Arrays.stream(arr).sum();
    int mid;

    while (lt <= rt) {
      mid = (lt + rt) / 2;

      if (count(arr, mid) <= m) {
        answer = mid;
        rt = mid - 1;
      } else {
        lt = mid + 1;
      }
    }

    return answer;
  }

  private static int count(int[] arr, int capacity) {
    int cnt = 1;
    int sum = 0;
    for (int x : arr) {
      if (sum + x > capacity) {
        cnt++;
        sum = x;
      } else {
        sum += x;
      }
    }

    return cnt;
  }

  /**
   * 10. 마구간 정하기
   *
   * @param n
   * @param c
   * @param arr
   * @return
   */
  public static int stable(int n, int c, int[] arr) {
    int answer = 0;

    Arrays.sort(arr);
    int lt = arr[0];
    int rt = Arrays.stream(arr).max().getAsInt();

    while (lt <= rt) {
      int mid = (lt + rt) / 2;
      
      //배치되면
      if(stableCount(arr,mid) >= c){
        answer = mid;
        lt = mid+1;
      }else{
        rt = mid-1;
      }
    }
    return answer;
  }

  private static int stableCount(int[] arr, int distance) {
    int cnt=1;
    int currentIdx = 0;
    for (int i = 1; i < arr.length; i++) {
      if(arr[currentIdx] + distance <= arr[i]){
        cnt++;
        currentIdx = i;
      }
    }

    return cnt;
  }
}
