package queuedemo;

class Node{
    public int val;
    public Node next;

    public Node() {
    }
    public Node(int val) {
        this.val = val;
    }
}

public class MyQueue {
    public Node first;
    public Node Last;

    /**
     * 插入元素
     * @param val
     * @return
     */
    public boolean offer(int val) {
        Node node = new Node(val);
        if (this.first == null) {
            this.first = node;
            this.Last = node;
        } else {
            this.Last.next = node;
            this.Last = node;
        }
        return true;
    }

    /**
     * 判断队列是否是空
     * @return
     */
    public boolean isEmpty() {
        if (this.first == null && this.Last == null) {
            return true;
        }
        return false;
    }

    /**
     * 得到队头元素并且删除
     * @return
     * @throws RuntimeException
     */
    public int poll() throws RuntimeException{
        if (isEmpty()) {
            throw new RuntimeException("队列为空");
        }
        int num = this.first.val;
        this.first = this.first.next;
        return num;
    }

    /**
     * 得到队头元素不删除
     * @return
     */
    public int peek() {
        if (isEmpty()) {
            throw new RuntimeException("队列为空");
        }
        return this.first.val;
    }
}
