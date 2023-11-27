package inflearn.java.algorithm.problem.solving.beginner.ch7;

import inflearn.java.algorithm.problem.solving.beginner.ch7.ShortestPathDFS.Node;
import java.util.LinkedList;
import java.util.Queue;

/**
 * 10. Tree 말단 노드까지의 가장 짧은 경로(DFS)
 */
public class ShortestPathBFS {

  static class Node {

    int data;

    Node lt, rt;

    Node(int data) {
      this.data = data;
      lt = rt = null;
    }
  }

  static int BFS(Node root) {
    Queue<Node> queue = new LinkedList<>();
    int answer = Integer.MAX_VALUE;
    int L = 0;

    queue.offer(root);

    while (!queue.isEmpty()) {
      int len = queue.size();
      for (int i = 0; i < len; i++) {
        Node node = queue.poll();

        if (node.lt == null && node.rt == null) {
          return L;
        } else {
          if (node.lt != null) {
            queue.offer(node.lt);
          }
          if (node.rt != null) {
            queue.offer(node.rt);
          }
        }
      }
      L++;
    }

    return L;
  }

  public static void main(String[] args) {
    Node root = new Node(1);
    root.lt = new Node(2);
    root.rt = new Node(3);
    root.lt.lt = new Node(4);
    root.lt.rt = new Node(5);

    System.out.println(BFS(root));
  }
}
