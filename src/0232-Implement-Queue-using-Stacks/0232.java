public class MyQueue {

    boolean isUsing1 = false;

    Stack<Integer> stack1 = new Stack();
    Stack<Integer> stack2 = new Stack();

    public MyQueue() {

    }

    public void push(int x) {
        if (isUsing1) {
            moveStackOneToTwo();
            isUsing1 = false;
        }
        stack2.push(x);
    }

    public int pop() {

        if (!isUsing1) {
            moveStackTwoToOne();
            isUsing1 = true;
        }
        return stack1.pop();

    }

    public int peek() {
        if (!isUsing1) {
            moveStackTwoToOne();
            isUsing1 = true;
        }
        return stack1.peek();
    }

    public boolean empty() {
        if (!isUsing1) {
            moveStackTwoToOne();
            isUsing1 = true;
        }
        return stack1.isEmpty();
    }

    private void moveStackOneToTwo() {
        while (!stack1.isEmpty()) {
            stack2.push(stack1.pop());
        }
    }

    private void moveStackTwoToOne() {
        stack1.empty();
        while (!stack2.isEmpty()) {
            stack1.push(stack2.pop());
        }
    }
}