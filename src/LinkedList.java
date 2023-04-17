public class LinkedList {
  private Node head;
  private Node tail;
  private int length;

  public class Node{

    int value;

    Node next;

    public Node(int value) {
      this.value = value;
    }

  }

  public LinkedList(int value) {
    Node newNode = new Node(value);
    this.head = newNode;
    this.tail = newNode;
    this.length = 1;
  }

  public void append(int value){
    Node newNode =  new Node(value);
    if (this.length > 0){
      tail.next = newNode;
      this.length++;
      tail = newNode;
    }else{
      this.head = newNode;
      this.tail = newNode;
      this.length = 1;
    }
  }


  public Node removeLast(){
    if (length == 0) return null;
    Node startNode = head;
    Node tmpNode = startNode;
    while ( tmpNode.next != null ){
        startNode = tmpNode;
        tmpNode = tmpNode.next;
    }
    startNode.next = null;
    tail = startNode;
    length--;
    if (length == 0){
      head = null;
      tail = null;
    }
    return tmpNode;
  }

}
