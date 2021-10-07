package ChallengeFive.stack;

public class Stack {
  private StackNode top;
public String data;
  public void push(String data) {
    if (isEmpty()) {
      StackNode node = new StackNode(data);
      top = node;
    } else {
      StackNode node = new StackNode(data);
      node.setNext(top);
      top = node;
    }
  }

  public String pop() {
    if (isEmpty()) {
      return "";
    } else {
      String data = top.getData();
      top = (StackNode) top.getNext();
    }
    return data;
  }

  public String peek() {
if(isEmpty()){
  return "the stack is empty";

}else {
  return top.getData();
}
  }

  public boolean isEmpty() {
    return top == null;
  }
}
