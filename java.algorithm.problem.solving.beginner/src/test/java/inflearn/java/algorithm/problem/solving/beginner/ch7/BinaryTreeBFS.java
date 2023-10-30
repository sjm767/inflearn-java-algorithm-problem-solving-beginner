package inflearn.java.algorithm.problem.solving.beginner.ch7;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 7. 이진트리탐색 (BFS)
 */
public class BinaryTreeBFS {



  static class Node{
    int data;

    Node lt,rt;

    Node(int data) {
      this.data = data;
      lt=rt=null;
    }
  }

  Node root;

  public static void BFS(Node root){
    Queue<Node> queue = new LinkedList<>();

    queue.offer(root);
    while (!queue.isEmpty()) {

      int len = queue.size();
      for (int i = 0; i < len; i++) {
        Node node = queue.poll();
        System.out.print(node.data+" ");

        if(node.lt != null){
          queue.offer(node.lt);
        }
        if (node.rt != null) {
          queue.offer(node.rt);
        }
      }
    }
  }

  public static void main(String[] args) {
    BinaryTreeBFS tree = new BinaryTreeBFS();
    tree.root = new Node(1);
    tree.root.lt = new Node(2);
    tree.root.rt = new Node(3);
    tree.root.lt.lt = new Node(4);
    tree.root.lt.rt = new Node(5);
    tree.root.rt.lt = new Node(6);
    tree.root.rt.rt = new Node(7);

    BFS(tree.root);
  }
}
