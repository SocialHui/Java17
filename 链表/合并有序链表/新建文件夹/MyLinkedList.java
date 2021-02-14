
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
    public Node head2 = new Node();

    public void createdLinked() {
        this.head = new Node(10);
        Node node = new Node(20);
        Node node1 = new Node(30);
        Node node2 = new Node(40);
        Node node3 = new Node(50);
        Node node4 = new Node(60);
        this.head.next = node;
        node.next = node1;
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;


        this.head2 = new Node(15);
        Node node5 = new Node(18);
        Node node6 = new Node(25);
        Node node7 = new Node(35);
        this.head2.next = node5;
        node5.next = node6;
        node6.next = node7;
    }

    public Node mergeTwoLists(Node node1, Node node2) {
        Node newHead = new Node();
        Node cur = newHead;
        while (node1 != null && node2 != null) {
            if (node1.val > node2.val) {
                cur.next = node2;
                node2 = node2.next;
            } else {
                cur.next = node1;
                node1 = node1.next;
            }
            cur = cur.next;
        }
        if (node1 != null) {
            cur.next = node1;
        }
        if (node2 != null) {
            cur.next = node2;
        }
        return newHead.next;
    }
}
