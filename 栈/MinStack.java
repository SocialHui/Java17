import java.util.Stack;

public class MinStack {
    private Stack<Integer> stack = new Stack<>();
    private Stack<Integer> minStack = new Stack<>();

    /** initialize your data structure here. */
    public MinStack() {

    }

    public void push(int x) {
        stack.push(x);
        if (minStack.empty()) {
            minStack.push(x);
        } else  {
            if (x <= minStack.peek()){
                minStack.push(x);
            }
        }
    }

    public void pop() {
        if (stack.empty()){
            return;
        }
        int x = stack.pop();
        if (x == minStack.peek()){
            minStack.pop();
        }
    }

    //和最小栈无关
    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return minStack.peek();
    }

}
