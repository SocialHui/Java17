
class Node {
    int val;
    Node next;

    public Node() {

    }

    public Node(int val){
        this.val = val;
    }
}

public class FenGe {

    public Node head;

    public void addFirst(int val) {
        if (this.head == null) {
            head = new Node(val);
            return;
        }
        Node cur = new Node(val);
        cur.next = this.head;
        this.head = cur;
    }

    public void display() {
        if (this.head == null) return;
        Node cur = new Node();
        cur = this.head;
        while (cur != null) {
            System.out.print(cur.val+" ");
            cur = cur.next;
        }
        System.out.println();
    }

    public void addLast(int val) {
        Node node = new Node();
        if (this.head == null) {
            this.head = node;
            this.head.val = val;
            return;
        }
        Node cur = new Node();
        cur = this.head;
        while (cur.next != null) {
            cur = cur.next;
        }
        cur.next = node;
        cur.next.val = val;
    }

    public void ge(int val) {
        Node cur = this.head;
        Node newHead = new Node(val);
        Node newLastCur = newHead;
        while (cur != null) {
            if (val > cur.val) {
                newLastCur.next = new Node();
                newLastCur.next.val = cur.val;
                newLastCur = newLastCur.next;
            } else if (val < cur.val) {
                Node node = new Node();
                node.next = newHead;
                node.val = cur.val;
                newHead = node;
            }
            cur = cur.next;
        }
        while (newHead != null) {
            System.out.print(newHead.val + " ");
            newHead = newHead.next;
        }
    }
}
