class Node {
    int val;
    Node next;

    Node(int val) {
        this.val = val;
    }

    Node (int val, Node next) {
        this.val = val;
        this.next = next;
    }
}

public class MyQueue {
    //队列是链表实现的，采用头出尾进的方法
    //单链表实现

    private Node head;
    private Node tail;
    private int size;

    public void offer(int n) {
        Node node = new Node(n);
        if (head == null && tail == null) {
            //代表链表没有东西
            head = node;
            tail = node;
        }
        tail.next = node;
        tail = node;
        size++;
    }


    public int poll() {
        //出队列
        if (size == 0) {
            return 0;
        }
        Node oldHead = head;
        head = head.next;
        if (head == null) {
            tail = null;
        }
        size--;
        return oldHead.val;
    }

    public int peek() {
        if (size == 0) {
            //代表队列是空的，返回0
            return 0;
        }
        return head.val;
    }

    public boolean isEmpty() {
        boolean ret = false;

        if (size == 0) {
            ret = true;
        }

        return ret;
    }
}
