package inflearn.java.algorithm.problem.solving.beginner.ch7;

/**
 * 5. 전위, 중위, 후위 순회
 */
public class BinaryTreeDFS {

  static class Node{
    int data;

    Node lt,rt;

    Node(int data) {
      this.data = data;
      lt=rt=null;
    }
  }

  Node root;

  public static void DFS(Node node){
    if (node == null) {
      return;
    }else{
//      //전위
//      System.out.print(node.data+" ");
//      DFS(node.lt);
//      DFS(node.rt);

//      //중위
//      DFS(node.lt);
//      System.out.print(node.data+" ");
//      DFS(node.rt);

//      //후위
//      DFS(node.lt);
//      DFS(node.rt);
//      System.out.print(node.data+" ");
    }
  }
  public static void main(String[] args) {
    BinaryTreeDFS tree = new BinaryTreeDFS();
    tree.root = new Node(1);
    tree.root.lt = new Node(2);
    tree.root.rt = new Node(3);
    tree.root.lt.lt = new Node(4);
    tree.root.lt.rt = new Node(5);
    tree.root.rt.lt = new Node(6);
    tree.root.rt.rt = new Node(7);

    DFS(tree.root);
  }
}
