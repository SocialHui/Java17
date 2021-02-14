
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
        Node node2 = new Node(40);
        Node node3 = new Node(50);
        Node node4 = new Node(60);
        this.head.next = node;
        node.next = node1;
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
    }

    public Node partition(int val) {
        Node bs = null;
        Node be = null;
        Node as = null;
        Node ae = null;
        Node cur = this.head;
        while (cur != null) {
            if (cur.val < val) {
                if (bs == null) {
                    //说明一个节点也没有
                    bs = cur;
                    be = cur;
                } else {
                    be.next = cur;
                    be = be.next;
                }
            } else {
                if (as == null) {
                   as = cur;
                   ae = cur;
                } else {
                    ae.next = cur;
                    ae = ae.next;
                }
            }
            cur = cur.next;
        }
        if (bs == null) {
            return as;
        }
        be.next = as;
        if (as != null) {
            //说明最后一段肯定有数据
            ae.next = null;
        }
        return bs;
    }
}
