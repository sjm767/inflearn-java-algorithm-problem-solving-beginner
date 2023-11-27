package inflearn.java.algorithm.problem.solving.beginner.ch7;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 7. 이진트리 레벨탐색
 */
public class BinaryFirstSearchBFS {
  static class Node{
    int data;
    Node lt,rt;

    public Node(int val){
      data=val;
      lt=rt=null;
    }
  }

  static void BFS(Node root){
    Queue<Node> queue = new LinkedList<>();

    queue.offer(root);
    int L = 0;
    while (!queue.isEmpty()) {
      int len = queue.size();
      System.out.print(L+": ");
      for(int i=0;i<len;i++){
        Node node = queue.poll();
        System.out.print(node.data+" ");
        if(node.lt != null){
          queue.offer(node.lt);
        }
        if(node.rt != null){
          queue.offer(node.rt);
        }
      }
      L++;
      System.out.println();
    }
  }
  public static void main(String[] args) {
    Node root = new Node(1);
    root.lt = new Node(2);
    root.rt = new Node(3);
    root.lt.lt = new Node(4);
    root.lt.rt = new Node(5);
    root.rt.lt = new Node(6);
    root.rt.rt = new Node(7);

    BFS(root);
  }
}

