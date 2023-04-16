public class LinkedList {

  private Node head;
  private Node tail;
  private int length;

  public LinkedList(int value) {
    Node newNode = new Node(value);
    head = newNode;
    length = 1;
  }
  public void append(int value) {
    tail = head;
    Node newNode = new Node(value);
    head = newNode;
    length++;
  }
  public void prepend(int value) {
  }

  public boolean insert(int index, int value) {
  return true;
  }

}
