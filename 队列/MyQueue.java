import java.util.Stack;
//用栈实现队列
public class MyQueue {

    private Stack<Integer> s1 = new Stack<>();//入队
    private Stack<Integer> s2 = new Stack<>();//出队

    /** Initialize your data structure here. */
    public MyQueue() {

    }

    /** Push element x to the back of queue. */
    public void push(int x) {
        s1.push(x);
    }

    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        if (empty()){
            return -1;
        }
        if(s2.empty()) {
            while (!s1.empty()){
                s2.push(s1.pop());
            }
        }
        return s2.pop();
    }

    /** Get the front element. */
    public int peek() {
        if (empty()) {
            return -1;
        }

        if (!s2.empty()){
            return s2.peek();
        } else {
            while (!s1.empty()){
                s2.push(s1.pop());
            }
        }
        return s2.peek();
    }

    /** Returns whether the queue is empty. */
    public boolean empty() {
        return s1.empty() && s2.empty();
    }
}