package ChallengeFive.Queue;

import ChallengeFive.LinkedList.Node;

public class Queue {
  private Node front;
  private Node rear;


  public void enqueue(String data){
    if(isEmpty()){
      Node node = new Node(data);
      front=node;
      rear=node;
    }else{
      Node node =new Node(data);
      rear.setNext(node);
      rear=node;
    }

  }

  public String dequeue(){
if(isEmpty()){
  return "Queue is empty talk to the nearest doctor";
}else {
  String data=front.getData();
  front=front.getNext();
  return data;
}
  }
  public String peek(){
    return front.getData();
  }

  public boolean isEmpty(){
    return front == null;
  }

}
