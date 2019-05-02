import java.util.Stack;

public class Test20 {
    Stack<Integer> dataStack = new Stack<>();
    Stack<Integer> minStack = new Stack<>();
    public void push(int node) {
        if(minStack.isEmpty()||node<minStack.peek()){
            minStack.push(node);
            dataStack.push(node);
        }else{
            minStack.push(minStack.peek());
            dataStack.push(node);
        }
    }

    public void pop() {
        dataStack.pop();
        minStack.pop();

    }

    public int top() {
        return dataStack.peek();
    }

    public int min() {
        return minStack.peek();
    }
}
