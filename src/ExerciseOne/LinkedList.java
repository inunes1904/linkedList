package ExerciseOne;

public class LinkedList {
  // CREATE CLASS VARIABLES, NODE CLASS, AND CONSTRUCTOR HERE //
  private Node head;
  private Node tail;
  private int length;

  public LinkedList(int i) {
    Node newNode = new Node(i);
    this.length = 1;
    this.head = newNode;
    this.tail = newNode;
  }

  class Node{
    int value;
    Node next;

    public Node(int value) {
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
