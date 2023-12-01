package inflearn.java.algorithm.problem.solving.beginner.ch9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 9. 원더랜드
 */
public class Wonderland {

  static class Edge implements Comparable<Edge>{
    int v1;
    int v2;
    int cost;

    public Edge(int v1, int v2, int cost) {
      this.v1 = v1;
      this.v2 = v2;
      this.cost = cost;
    }

    @Override
    public int compareTo(Edge o) {
      return this.cost - o.cost;
    }
  }

  static int v;
  static int e;

  static int[] unf;

  static List<Edge> list;

  static int Find(int v){
    if(unf[v] == v){
      return v;
    }
    return unf[v] = Find(unf[v]);
  }

  static void Union(int a,int b){
    int fa = Find(a);
    int fb = Find(b);

    if(fa != fb){
      unf[fa] = fb;
    }
  }

  static int solution(){
    int answer = 0;

    Collections.sort(list);

    for (Edge e : list) {
      int f1 = Find(e.v1);
      int f2 = Find(e.v2);

      if(f1 != f2){
        answer += e.cost;
        Union(e.v1, e.v2);
      }

    }

    return answer;
  }
  public static void main(String[] args) {
    v = 9;
    e = 12;
    unf = new int[v+1];
    list = new ArrayList<>();

    for (int i = 0; i <= v; i++) {
      unf[i]=i;
    }

    list.add(new Edge(1, 2, 12));
    list.add(new Edge(1, 9, 25));
    list.add(new Edge(2, 3, 10));
    list.add(new Edge(2, 8, 17));
    list.add(new Edge(2, 9, 8));
    list.add(new Edge(3, 4, 18));
    list.add(new Edge(3, 7, 55));
    list.add(new Edge(4, 5, 44));
    list.add(new Edge(5, 6, 60));
    list.add(new Edge(5, 7, 38));
    list.add(new Edge(7, 8, 35));
    list.add(new Edge(8, 9, 15));

    System.out.println(solution());
  }
}
