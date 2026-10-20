class MyQueue {

  private Deque<Integer> inputStack;
  private Deque<Integer> outputStack;

  public MyQueue() {
    inputStack = new ArrayDeque<>();
    outputStack = new ArrayDeque<>();
  }

  public void push(int x) {
    inputStack.push(x);
  }

  public int pop() {

    shiftStack();
    return outputStack.pop();
  }

  public int peek() {
    shiftStack();
    return outputStack.peek();
  }

  public boolean empty() {
    return inputStack.isEmpty() && outputStack.isEmpty();
  }

  //helper method to reverse the data flow 
  private void shiftStack() {
    if (outputStack.isEmpty()) {
      while (!inputStack.isEmpty()) {
        outputStack.push(inputStack.pop());
      }
    }
  }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */