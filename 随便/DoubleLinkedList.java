
class ListNode{
    private int val;
    private ListNode prev;
    private ListNode next;

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public ListNode getPrev() {
        return prev;
    }

    public void setPrev(ListNode prev) {
        this.prev = prev;
    }

    public ListNode getNext() {
        return next;
    }

    public void setNext(ListNode next) {
        this.next = next;
    }

    public ListNode(int val) {
        this.val = val;
    }
    public ListNode () {

    }
}

public class DoubleLinkedList {

    ListNode head; //头
    ListNode last; //尾巴

    public void addFirst (int val) {
        ListNode node = new ListNode(val);
        if (this.head == null) {
            this.head = node;
            this.last = node;
            return;
        }
        this.head.setPrev(node);
        node.setNext(this.head);
        this.head = node;
    }

    public void addLast(int val) {
        ListNode node = new ListNode(val);
        if (this.head == null) {
            this.head = node;
            this.last = node;
            return;
        }
        this.last.setNext(node);
        node.setPrev(this.last);
        this.last = node;
    }

    public void disPlay() {
        if (this.head == null) {
            return;
        }
        ListNode cur = this.head;
        while (cur != null) {
            System.out.print(cur.getVal()+" ");
            cur = cur.getNext();
        }
        System.out.println();
    }

    

}
