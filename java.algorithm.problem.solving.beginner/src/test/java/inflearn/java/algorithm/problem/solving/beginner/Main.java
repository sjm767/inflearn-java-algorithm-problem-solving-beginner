package inflearn.java.algorithm.problem.solving.beginner;

import java.util.*;

public class Main {


  static class Point implements Comparable<Point>{
    public int x;
    public int y;

    public Point(int x, int y) {
      this.x = x;
      this.y = y;
    }

    @Override
    public int compareTo(Point  o) {
      if (this.x == o.x) {
        return this.y - o.y;
      }
      return this.x-o.x;
    }
  }

  public static List<Point> compareTo(int n, List<Point> points){
    Collections.sort(points);
    return points;
  }

  public static void main(String[] args) {
    Scanner kb = new Scanner(System.in);

    int n = kb.nextInt();
    List<Point> list = new ArrayList<>();

    for(int i=0;i<n;i++){
      int x=kb.nextInt();
      int y=kb.nextInt();
      list.add(new Point(x, y));
    }
    Collections.sort(list);

    for (Point point : list) {
      System.out.println(point.x + " " + point.y);
    }
  }

}
