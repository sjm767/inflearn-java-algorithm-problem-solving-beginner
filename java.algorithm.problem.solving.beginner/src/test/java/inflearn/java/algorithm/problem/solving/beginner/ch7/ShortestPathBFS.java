package inflearn.java.algorithm.problem.solving.beginner.ch7;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 9. Tree 말단 노드까지의 가장 짧은 경로(BFS)
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

  public static int BFS(Node root) {
    Queue<Node> queue = new LinkedList<>();
    queue.offer(root);
    int L = 0;
    while (!queue.isEmpty()) {
      int len = queue.size();
      for (int i = 0; i < len; i++) {
        Node node = queue.poll();

        if (node.lt == null && node.rt == null) {
          return L;
        }
        if (node.lt != null) {
          queue.offer(node.lt);
        }
        if (node.rt != null) {
          queue.offer(node.rt);
        }
      }
      L++;
    }

    return 0;
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
