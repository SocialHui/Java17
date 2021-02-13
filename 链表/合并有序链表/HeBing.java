
class Node{
    public int val;
    public Node next;

    public Node() {

    }
    public Node(int val) {
        this.val = val;
    }
}

public class HeBing {
    public Node head1 = new Node();
    public Node head2 = new Node();

    public void createdLinkedList(){
        this.head1 = new Node(10);
        Node node1 = new Node(20);
        Node node2 = new Node(30);
        Node node3 = new Node(40);
        this.head1.next = node1;
        node1.next = node2;
        node2.next = node3;
        Node cur = head1;
        while (cur != null) {
            System.out.print(cur.val + " ");
            cur = cur.next;
        }
        System.out.println();
        this.head2= new Node(15);
        Node node5 = new Node(25);
        Node node6 = new Node(26);
        Node node7 = new Node(31);
        this.head2.next = node5;
        node5.next = node6;
        node6.next = node7;
        Node cur1 = head2;
        while (cur1 != null) {
            System.out.print(cur1.val + " ");
            cur1 = cur1.next;
        }
        System.out.println();
    }

    public void heBing(Node head1, Node head2) {
        Node newHead = new Node();
        Node cur = newHead;
        Node cur1 = head1;
        Node cur2 = head2;
        while (cur1 != null && cur2 != null) {
            if (cur1.val < cur2.val) {
                cur.next = new Node(cur1.val);
                cur = cur.next;
                cur1 = cur1.next;
            } else if (cur2.val < cur1.val) {
                cur.next = new Node(cur2.val);
                cur = cur.next;
                cur2 = cur2.next;
            }
        }
        if (cur1 != null) {
            cur.next = cur1;
        } else if (cur2 != null) {
            cur.next = cur2;
        }
        while (newHead != null) {
            System.out.print(newHead.val + " ");
            newHead = newHead.next;
        }
    }

}
