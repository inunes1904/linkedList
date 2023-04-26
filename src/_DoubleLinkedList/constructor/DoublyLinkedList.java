package _DoubleLinkedList.constructor;

import _DoubleLinkedList.DoubleLinkedList;



  public class DoublyLinkedList {

    // CREATE CLASS VARIABLES, NODE CLASS, AND CONSTRUCTOR HERE //
    private Node head;
    private Node tail;
    private int length;

    public DoublyLinkedList(int value){
      Node newNode = new Node(value);
      head = newNode;
      tail = newNode;
      length++;
    }

    public class Node{

      Node prev;
      Node next;

      int value;

      public Node(int value){
        this.value = value;
      }

    }

    public void printList() {
      Node temp = head;
      while (temp != null) {
        System.out.println(temp.value);
        temp = temp.next;
      }
    }

    public void getHead() {
      if (head == null) {
        System.out.println("Head: null");
      } else {
        System.out.println("Head: " + head.value);
      }
    }

    public void getTail() {
      if (head == null) {
        System.out.println("Tail: null");
      } else {
        System.out.println("Tail: " + tail.value);
      }
    }

    public void getLength() {
      System.out.println("Length: " + length);
    }

  }



