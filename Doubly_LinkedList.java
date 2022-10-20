//  Doubly linked list in JAVA

import java.util.Scanner;

public class Doubly_LinkedList {
  static class Node {
    Node next;
    Node prev;
    int data;
    Node (int data) {
      this.next = null;
      this.data = data;
      this.prev = null;
    }
  }
  Node head = null;
  Node tail = null;
  
  void creation () {
    Scanner sc = new Scanner(System.in);
    for (int i = 0; i < 10 ; i++ ) {
      System.out.println("Enter Data : ");
      int data = sc.nextInt();
      Node newNode = new Node(data);
      if (head == null) {
        head = newNode;
        tail = newNode;
      } else {
        head.prev = newNode;
        newNode.next = head ;
        head = newNode;
      }
    }
  }
  
  void triversal () {
    //  Using next
    Node temp = head;
    while (temp != null) {
      System.out.println(temp.data);
      temp = temp.next;
    }
    System.out.println("\n \n");
    Node temp2 = tail;
    while(temp2 != null) {
      System.out.println(temp2.data);
      temp2 = temp2.prev;
    }
  }
  
  void insertion () {
    Scanner sc = new Scanner(System.in);
    System.out.println("Insert Data : ");
    int data = sc.nextInt();
    Node newNode = new Node(data);
    head.prev = newNode;
    newNode.next = head;
    head = newNode;
  }
  
  void delete () {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Data To Delete : ");
    int data = sc.nextInt();
    Node temp = head;
    while (temp.next.data != data) {
      temp = temp.next;
    }
    temp.next = temp.next.next;
    
    Node temp2 = tail;
    while (temp2.prev.data != data) {
      temp2 = temp2.prev;
    }
    temp2.prev = temp2.prev.prev;
  }
  public static void main (String[] args) {
    Doubly_LinkedList dll = new Doubly_LinkedList();
    dll.creation();
    dll.insertion();
    dll.delete();
    dll.triversal();
    
  }
}
