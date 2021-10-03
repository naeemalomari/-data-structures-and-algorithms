package ChallengeFive.stucture;

import ChallengeFive.data.LinkedListNode;

public class LinkedList {
  LinkedListNode head;

  public void insert(String data) {
    if (head == null) {
      LinkedListNode node = new LinkedListNode(data);
      head = node;
    } else {
      LinkedListNode current = head;
      while (current.getNext() != null) {
        current = current.getNext();
      }
      LinkedListNode node = new LinkedListNode(data);
      current.setNext(node);
    }
  }

  public boolean include(String data) {
    if (head == null) {
      LinkedListNode node = new LinkedListNode(data);
      head = node;
    } else {
      LinkedListNode current = head;
      while (current != null) {
        if (current.getData() == data) {
          return true;
        }
        current = current.getNext();
      }
    }
    return false;
  }


  public void append(String data) {
    if (head == null) {
      LinkedListNode node = new LinkedListNode(data);
      head = node;
    } else {
      LinkedListNode current = head;
      while (current.getNext() != null) {
        current = current.getNext();
      }
      LinkedListNode node = new LinkedListNode(data);
      current.setNext(node);
    }
  }

  public void insertBefore(String data, String before) {
    if (head == null) {
      LinkedListNode node = new LinkedListNode(data);
      head = node;
    } else {
      LinkedListNode current = head;
      while(current !=null && current.getNext() !=  )
      }
    }




  @Override
  public String toString() {
    String printing = "";
    if (head == null) {
      System.out.println("THE LIST IS EMPTY ");
    } else {
      LinkedListNode current = head;
      while (current != null) {
        printing = printing + " { " + current.getData() + " } " + " -> ";
        current = current.getNext();
      }
      printing = printing + " NULL ";
    }
    return printing;
  }

}

