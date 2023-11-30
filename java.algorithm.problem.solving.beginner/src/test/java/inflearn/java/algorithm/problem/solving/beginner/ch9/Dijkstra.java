package inflearn.java.algorithm.problem.solving.beginner.ch9;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * 5. 다익스트라 알고리즘 (최단경로 알고리즘)
 */
public class Dijkstra {

  static class Edge implements Comparable<Edge>{
    int vex;
    int cost;

    public Edge(int vex, int cost) {
      this.vex = vex;
      this.cost = cost;
    }

    @Override
    public int compareTo(Edge o) {
      return this.cost - o.cost;
    }
  }
  static int[] dis;
  static List<List<Edge>> list;

  static void solution(int v){
    Queue<Edge> queue = new PriorityQueue<>();

    queue.offer(new Edge(v, 0));
    dis[v] = 0;

    while (!queue.isEmpty()) {
      Edge tmp = queue.poll();
      int now = tmp.vex;
      int nowCost = tmp.cost;

      if (nowCost > dis[now]) {
        continue;
      }

      for (Edge edge : list.get(now)) {
        if (dis[edge.vex] > nowCost + edge.cost) {
          dis[edge.vex] = nowCost + edge.cost;
          queue.offer(new Edge(edge.vex, nowCost + edge.cost));
        }

      }


    }
  }

  public static void main(String[] args) {
    int n = 6;
    int m = 9;
    list = new ArrayList<>();
    dis = new int[n + 1];

    for (int i = 0; i < dis.length; i++) {
      dis[i] = Integer.MAX_VALUE;
    }

    for(int i=0;i<=n;i++){
      list.add(new ArrayList<>());
    }

    list.get(1).add(new Edge(2, 12));
    list.get(1).add(new Edge(3, 4));
    list.get(2).add(new Edge(1, 2));
    list.get(2).add(new Edge(5, 5));
    list.get(2).add(new Edge(5, 5));
    list.get(3).add(new Edge(4, 5));
    list.get(4).add(new Edge(2, 2));
    list.get(4).add(new Edge(5, 5));
    list.get(6).add(new Edge(4, 5));

    solution(1);

    for (int i = 2; i <= n; i++) {
      if(dis[i]!=Integer.MAX_VALUE){
        System.out.println(i+" : "+dis[i]);
      }else{
        System.out.println(i+" : impossible");
      }

    }
    System.out.println();
  }
}
