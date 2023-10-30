package inflearn.java.algorithm.problem.solving.beginner.ch7;

/**
 * 9. Tree 말단 노드까지의 가장 짧은 경로(DFS)
 */
public class ShortestPathDFS {

  static class Node {

    int data;

    Node lt, rt;

    Node(int data) {
      this.data = data;
      lt = rt = null;
    }
  }
  static int answer = Integer.MAX_VALUE;
  public static int DFS(Node root, int L) {
    if (root.lt == null && root.rt == null) {
      return L;
    } else {
      return Math.min(DFS(root.lt, L + 1),DFS(root.rt, L+1));
    }
  }

  public static void main(String[] args) {
    Node root = new Node(1);
    root.lt = new Node(2);
    root.rt = new Node(3);
    root.lt.lt = new Node(4);
    root.lt.rt = new Node(5);

    DFS(root,0);
    System.out.println(answer);
  }
}
