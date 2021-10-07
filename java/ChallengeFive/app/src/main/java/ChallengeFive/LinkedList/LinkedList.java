package ChallengeFive.LinkedList;

public class LinkedList {
  private Node head;



  public void insert(String data) {
    if (head == null) {
      Node node = new Node(data);
      head = node;
    } else {
      Node current = head;
      while (current.getNext() != null) {
        current = current.getNext();
      }
      Node node = new Node(data);
      current.setNext(node);
    }
  }
  public boolean include(String data){
    if(head == null){
      Node node =new Node(data);
      head=node;
    }else {
        Node current =head;
        while(current !=null) {
          if (current.getData() == data) {
            return true;
          }
          current = current.getNext();
        }
    }
    return false;
  }
  @Override
  public String toString() {
    String printing = "";
    if (head == null) {
      System.out.println("THE LIST IS EMPTY ");
    } else {
      Node current = head;
      while (current != null) {
        printing = printing + " { " + current.getData() + " } " + " --------> ";
        current = current.getNext();
      }
      printing = printing + " NULL ";
    }
    return printing;
  }
}
