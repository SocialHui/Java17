public class MyQueue {
    public static class Node {
        int val;
        Node next;
        public Node(int val){
            this.val = val;
        }
    }

    public Node head = null;
    public Node tail = null;

    public void push(int val) {
        Node node = new Node(val);
        if (this.head == null) {
            this.head = node;
            this.tail = node;
            return;
        }
        this.tail.next = node;
        this.tail = node;
    }

    public void show() {
        Node cur = this.head;
        while (cur != null) {
            System.out.print(cur.val+" ");
            cur = cur.next;
        }
        System.out.println();
    }

    public int get() {
        if (this.head == null) {
            return -1;
        }
        return this.head.val;
    }

    public void remove() {
        if (this.head == null) {
            return;
        }
        if (this.head.next == null) {
            this.head = null;
            this.tail = null;
            return;
        }
        this.head = this.head.next;
    }

    public boolean isEmpty() {
        return this.head == null;
    }
}
