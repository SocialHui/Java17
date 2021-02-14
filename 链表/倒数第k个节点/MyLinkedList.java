
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

    Node head = new Node();

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

    public Node findLastKNode(int k) {
        if (this.head == null || k < 0) {
            return null;
        }
        Node slow = this.head;
        Node quick = this.head;
        while (k != 0) {
            if (quick != null) {
                quick = quick.next;
                k--;
            }else {
                return null;  //代表k值过大
            }
        }
        while (quick != null) {
            slow = slow.next;
            quick = quick.next;
        }
        return slow;
    }
}
