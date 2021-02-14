
class Node {
    public int val;
    public Node next;

    public Node() {

    }
    public Node(int val) {
        this.val = val;
    }
}

public class MyLinkedList {

    public Node head = new Node();

    public void createdLinked() {
        this.head = new Node(10);
        Node node = new Node(20);
        Node node1 = new Node(30);
        Node node2 = new Node(50);
        Node node3 = new Node(50);
        Node node4 = new Node(50);
        this.head.next = node;
        node.next = node1;
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
    }

    //    public void deleteDuplication() {
//        if (this.head == null) return;
//        Node cur = this.head;
//        Node prev = this.head;
//
//        while (cur != null && cur.next != null && cur.val == cur.next.val) {
//            this.head = this.head.next.next;
//            cur = this.head;
//            prev = this.head;
//        }
//        while (cur != null && cur.next != null) {
//            if (cur.val == cur.next.val) {
//                cur = cur.next.next;
//                prev.next = cur;
//            } else {
//                prev = cur;
//                cur = cur.next;
//            }
//        }
//        while (this.head != null) {
//            System.out.print(this.head.val+ " ");
//            this.head = this.head.next;
//        }
//    }
    public void deleteDuplication() {
        if (this.head == null) {
            return;
        }
        Node newHead = new Node();
        Node tmp = newHead;
        Node cur = this.head;
        while (cur != null) {
            if (cur.next != null && cur.val == cur.next.val) {
                while (cur.next != null && cur.val == cur.next.val) {
                    cur = cur.next;
                }
                cur = cur.next;
            } else {
                tmp.next = cur;
                tmp = tmp.next;
                cur = cur.next;
            }
        }
        tmp.next = null;
        while (newHead.next != null) {
            System.out.print(newHead.next.val+" ");
            newHead = newHead.next;
        }
    }
}
