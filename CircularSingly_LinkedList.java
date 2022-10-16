//  CircularSingly linked List in JAVA
import java.util.Scanner;
public class CircularSingly_LinkedList {
  
 static class Node {
    Node next ;
    int data ;
    Node (int data) {
      this.data = data ;
      this.next = null ;
    } 
  }
    Node head = null;
    Node tail = null;
    
  public void creation () {
    Scanner sc = new Scanner(System.in);
    for (int i = 0; i < 10; i++ ) {
      System.out.println("Enter Data ");
      int data = sc.nextInt();
      Node newNode = new Node(data);
      if (head == null) {
        head = newNode;
        tail = newNode;
        tail.next = head;
      } else {
        //  Insertion At Last
        /* 
        newNode.next = head ;
        head = newNode ;
        */
        
        //  Insertion At Begining
        
        Node temp = head;
        while (temp.next != head) {
          temp = temp.next ;
        }
        temp.next = newNode ;
        tail = newNode;
        tail.next = head;
      }
    } 
  }
  
  public void triversal () {
    Node temp = head ;
    System.out.println("Linked List Is  :-  ");
    while (temp.next != head) {
      System.out.print(temp.data + "   ");
      temp = temp.next;
    }
    System.out.print(tail.data);
  }
  
  public void insertion () {
    Scanner sc = new Scanner(System.in);
    System.out.println("\n Enter Data To Add");
    int data = sc.nextInt();
    Node newNode = new Node(data);
    if (head == null) {
      head = newNode ;
    } else {
      //  insertion At Begining
      /*
      newNode.next = head ;
      head = newNode ;
      */
      
      //  Insertion At Last
      Node temp = head ;
      while (temp.next != head) {
        temp = temp.next ;
      }
      temp.next = newNode ;
      tail = newNode;
      tail.next = head;
    }
  }
  
  public void deletion () {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Data To Delete");
    int data = sc.nextInt();
    Node temp = head ;
    Node temp2 = head.next ;
    if (temp.data == data ) {
      head = head.next;
    } else {
    while (temp.next.data != data) {
      temp = temp.next ;
    }
    temp.next = temp.next.next ;
    }
  }
  
  public static void main (String[] args) {
    
    CircularSingly_LinkedList csll = new CircularSingly_LinkedList();
    csll.creation();
    // csll.triversal();
    csll.insertion();
    csll.deletion();
    csll.triversal();
    
  }
}
