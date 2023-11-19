package inflearn.java.algorithm.problem.solving.beginner;

import java.util.*;

public class Main {
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

  static Point[] solution(int n, Point[] arr){
    Arrays.sort(arr);
    return arr;
  }

  public static void main(String[] args) {
    Scanner kb = new Scanner(System.in);
    int n = kb.nextInt();
    Point[] arr = new Point[n];

    for(int i=0;i<n;i++){
      int x = kb.nextInt();
      int y = kb.nextInt();
      arr[i] = new Point(x, y);
    }

    Point[] ans = solution(n, arr);
    for (Point p : ans) {
      System.out.println(p.x+" " +p.y);
    }
  }
}
