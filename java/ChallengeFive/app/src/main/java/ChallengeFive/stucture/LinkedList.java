package ChallengeFive.stucture;

import ChallengeFive.data.LinkedListNode;

import java.io.IOException;


public class LinkedList {
  public LinkedListNode head;

  private int size;
  private Exception IOException;

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
    size++;
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
    size++;
  }


  public void insertBefore(String data, String before) {
    LinkedListNode node = new LinkedListNode(before);
    if (head == null) {
      System.out.println("this " + data + " Not Exist in the linked list ");
      return;
    } else if (data == head.getData()) {
      node.next = head;
      head = node;
      size++;
    } else {
      LinkedListNode temp = head;
      while (temp.next != null) {
        if (temp.next.getData() == data) {
          node.next = temp.next;
          temp.next = node;
          size++;
          return;
        }
        temp = temp.next;
      }
      System.out.println("this " + data + " Not Exist in the linked list ");
    }
  }

  public void insertAfter(String data, String after) {
    LinkedListNode node = new LinkedListNode(after);
    if (head == null) {
      System.out.println("this " + data + " Not Exist in the linked list ");
      return;
    } else {
      LinkedListNode temp = head;
      while (temp != null) {
        if (temp.getData() == data) {
          node.next = temp.next;
          temp.next = node;
          size++;
          return;
        }
        temp = temp.next;
      }
      System.out.println("this " + data + " Not Exist in the linked list ");
    }
  }

  public int getSize() {
    return size;
  }

  public String kth(int index)  {
    LinkedListNode current = head;
    if(head ==null){
      System.out.println("The list is empty please insert node.");
    }
    if (index > getSize() - 1 || index < 0) {
      return "Exception";
    }
    int i = 0;
    while (i < (getSize() - index - 1)) {
      current = current.getNext();
      i++;
    }
    return current.getData();
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

