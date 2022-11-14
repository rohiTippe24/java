//  Tree Datastructure in java
import java.util.*;
public class Tree {
  class Node {
    Node left , right;
    int data;
    Node (int data) {
      this.data = data;
      left = null;
      right = null;
    }
  }
  Node rot = null;
  // 
  public int i = -1;
   Node create (int[] arr) {
    int data = arr[++i];
    Node root = new Node(data);
    if (data == -1) {
      return null;
    } 
    root.left = create(arr);
    root.right = create(arr);
    rot = root;
    return root;
  }
  // 
  void inorder (Node root) {
    if (root == null) {
      return ;
    }
    inorder(root.left);
    System.out.print(root.data + "  ");
    inorder(root.right);
  }
  // 
  int count = 0;
   void preorder (Node root) {
    if (root == null) {
      count++;
      return ;
    }
    System.out.print(root.data + "  ");
    preorder(root.left);
    preorder(root.right);
  }
  // 
  void postorder (Node root) {
    if (root == null) {
      return ;
    }
    postorder(root.left);
    postorder(root.right);
    System.out.print(root.data + "  ");
  }
  // 
  void levelorder (Node root) {
    Queue<Node> q = new LinkedList<>();
    q.add(root);
    q.add(null);
    
    while (!q.isEmpty()) {
      Node n = q.remove();
      
      if (n == null) {
        System.out.println();
        if (q.isEmpty()) {
          break;
        } else {
          q.add(null);
        }
      } else {
        System.out.print( n.data + "  ");
        if (n.left != null) {
          q.add(n.left);
        }
        if (n.right != null) {
          q.add(n.right);
        }
      }
    }
  }
  // 
  int countOfNodes(Node root) {
    if (root == null) {
      return 0;
    } 
    int leftNodes = countOfNodes(root.left);
    int rightNodes = countOfNodes(root.right);
    return leftNodes + rightNodes + 1;
  }
  // 
  int sumOfNodes (Node root) {
    if (root == null) {
      return 0;
    }
    return root.data + sumOfNodes(root.left) +  sumOfNodes(root.right);
  }
  int multiplicationOfNodes (Node root) {
    if (root == null) {
      return 1;
    }
    return root.data * multiplicationOfNodes(root.left) *  multiplicationOfNodes(root.right);
  }
  // 
  int heightOfTree (Node root) {
    if (root == null) {
      return 0;
    }
    int a = heightOfTree(root.left)+1 ;
    int b =  heightOfTree(root.right)+1 ;
    return Math.max(a , b);
  }
  // 
  public static void main (String[] args) {
    Tree t = new Tree();
    int[] arr = {2 , 3 , 9 , 8 , -1 , 10 , -1 , -1 , -1 , 2 , -1 , -1 , 3 , -1 , 4 , -1 , -1};
    t.create(arr);
    System.out.print("Arry Inserting  :  [  " );
    for (int i = 0 ; i < arr.length ; i++) {
      System.out.print(arr[i] + "  ");
    }
    System.out.print("]");
    System.out.println("\n");
    System.out.println("Inorder Triversal : ");
    t.inorder(t.rot);
    System.out.println("\n");
    System.out.println("Preorder Triversal : ");
    t.preorder(t.rot);
    System.out.println("\n");
    System.out.println("Postoredr Triversal :");
    t.postorder(t.rot);
    System.out.println("\n");
    System.out.println("Levelorder Triversal :");
    t.levelorder(t.rot);
    System.out.println();
    System.out.println("Total Count of Nodes :  " + t.countOfNodes(t.rot));
    System.out.println();
    System.out.println("sum of Nodes  :  "+t.sumOfNodes(t.rot));
    System.out.println();
    System.out.println("Multiplication of Nodes  :  "+t.multiplicationOfNodes(t.rot));
    System.out.println();
    System.out.println("Height of Tree  :  " + t.heightOfTree(t.rot));
    System.out.println("🙃🙃🙃");
  }
}
