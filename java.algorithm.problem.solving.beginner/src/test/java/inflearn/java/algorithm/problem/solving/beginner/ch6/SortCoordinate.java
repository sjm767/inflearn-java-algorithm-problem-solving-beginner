package inflearn.java.algorithm.problem.solving.beginner.ch6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 7. 좌표 정렬
 */
public class SortCoordinate {

  static class Point implements Comparable<Point>{
    int x;
    int y;

    public Point(int x, int y) {
      this.x = x;
      this.y = y;
    }

    @Override
    public int compareTo(Point o) {
      if(this.x == o.x){
        return this.y - o.y;
      }
      return this.x - o.x;
    }
  }

  static Point[] solution(int n,Point[] arr){
    Arrays.sort(arr);
    return arr;
  }

  public static void main(String[] args) {
    int n = 5;
    Point[] arr = new Point[n];
    arr[0] = new Point(2,7);
    arr[1] = new Point(1,3);
    arr[2] = new Point(1,2);
    arr[3] = new Point(2,5);
    arr[4] = new Point(3,6);

    Point[] ans = solution(n, arr);
    for (Point p : ans) {
      System.out.println(p.x+" " +p.y);
    }
  }

}
