package Remove;

public class Main {

  public static void main(String[] args) {

    LinkedList myLinkedList = new LinkedList(1);
    myLinkedList.append(2);
    myLinkedList.append(3);
    myLinkedList.append(4);
    myLinkedList.append(5);

    System.out.println("LL before removeLast():");
    myLinkedList.printList();

    System.out.println("\nRemoved node:");
    System.out.println(myLinkedList.remove(2).value);
    System.out.println("LL after removeLast() in middle:");
    myLinkedList.printList();

    System.out.println("\nRemoved node:");
    System.out.println(myLinkedList.remove(0).value);
    System.out.println("LL after removeLast() of first node:");
    myLinkedList.printList();

    System.out.println("\nRemoved node:");
    System.out.println(myLinkedList.remove(2).value);
    System.out.println("LL after removeLast() of last node:");
    myLinkedList.printList();
        /*
            EXPECTED OUTPUT:
            ----------------
            LL before removeLast():
            1
            2
            3
            4
            5

            Removed node:
            3
            LL after removeLast() in middle:
            1
            2
            4
            5

            Removed node:
            1
            LL after removeLast() of first node:
            2
            4
            5

            Removed node:
            5
            LL after removeLast() of last node:
            2
            4
        */
  }
}

