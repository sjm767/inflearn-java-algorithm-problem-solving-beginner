package inflearn.java.algorithm.problem.solving.beginner.ch7;

/**
 * 5. 이진트리 순회 (DFS)
 */
public class BinaryTreeDFS {
  static class Node{
    int data;
    Node lt,rt;

    public Node(int val){
      data=val;
      lt=rt=null;
    }
  }

  static void DFS(Node root){
    if(root == null){
      return;
    }
    else{
//      //전위
//      System.out.print(root.data+" ");
//      DFS(root.lt);
//      DFS(root.rt);

//      //중위
//      DFS(root.lt);
//      System.out.print(root.data+" ");
//      DFS(root.rt);

      //후위
      DFS(root.lt);
      DFS(root.rt);
      System.out.print(root.data+" ");
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

    DFS(root);
  }

}
