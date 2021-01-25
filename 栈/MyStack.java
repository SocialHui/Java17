import java.util.LinkedList;
import java.util.Queue;
//用队列实现栈
public class MyStack {

    private Queue<Integer> qu1 = new LinkedList<>();
    private Queue<Integer> qu2 = new LinkedList<>();

    /** Initialize your data structure here. */
    public MyStack() {

    }

    /** Push element x onto stack. */
    public void push(int x) {
        //谁不为空入到哪个队列当中
        if (!this.qu2.isEmpty()){
            this.qu2.add(x);
        } else {
            this.qu1.add(x);
        }
    }

    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        if (empty()) {
            return -1;
        }
        //每次出不为空的队列，出size-1个 到另外一个为空的队列，最后弹出剩余的那一个元素
        /*
        //注意！！！！！这样写的时候循环里面的qu2.size()一直在变
        if (!this.qu1.isEmpty()){
            for (int i = 0; i < qu2.size()-1; i++) {
                this.qu1.add(this.qu2.poll());
            }
            return qu2.poll();
        }
        if (!this.qu2.isEmpty()) {
            for (int i = 0; i < qu1.size()-1; i++) {
                this.qu2.add(this.qu1.poll());
            }
            return qu1.poll();
        }*/
        if (!this.qu1.isEmpty()){
            int size = qu1.size();
            for (int i = 0; i < size-1; i++) {
                this.qu2.offer(this.qu1.poll());
            }
            return qu1.poll();
        } else {
            int size = qu2.size();
            for (int i = 0; i < size-1; i++) {
                this.qu1.offer(this.qu2.poll());
            }
            return qu2.poll();
        }
    }


    /** Get the top element. */
    public int peek() {
        if (empty()) {
            return -1;
        }
        if (!this.qu1.isEmpty()){
            int size = qu1.size();
            for (int i = 0; i < size; i++) {
                this.qu2.offer(this.qu1.poll());
            }
            return qu2.peek();
        } else {
            int size = qu2.size();
            for (int i = 0; i < size; i++) {
                this.qu1.offer(this.qu2.poll());
            }
            return qu1.peek();
        }
    }

    /** Returns whether the stack is empty. */
    public boolean empty() {
        if (this.qu1.isEmpty() && this.qu2.isEmpty()){
            return true;
        }
        return false;
    }
}

/*
    public int peek() {
        if(empty()) {
            return -1;
        }
        //每次出不为空的队列，出size-1个 到另外一个为空的队列，最后弹出剩余的那一个元素
        if(!qu1.isEmpty()) {
            int size =  qu1.size();
            int cur = -1;
            for(int i = 0;i < size;i++) {
                cur = qu1.poll();
                qu2.offer(cur);
            }
            return cur;
        }else {
            int size =  qu2.size();
            int cur = -1;
            for(int i = 0;i < size;i++) {
                cur = qu2.poll();
                qu1.offer(cur);
            }
            return cur;
        }
    }*/



