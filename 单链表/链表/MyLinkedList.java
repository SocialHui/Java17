public class MyLinkedList {
    class Node {
        private int val;
        private Node next;
    }

    Node head;
    /** Initialize your data structure here. */
    public MyLinkedList() {

    }

    //打印链表
    public void disPlay() {
        Node cur = head;
        while (cur != null){
            System.out.print(cur.val + " ");
            cur = cur.next;
        }
        System.out.println();
    }

    //计算链表中元素的个数
    public int num() {
        int count = 0;
        Node cur = head;
        while (cur != null) {
            count++;
            cur = cur.next;
        }
        return count;
    }

    /** Get the value of the index-th node in the linked list. If the index is invalid, return -1. */
    public int get(int index) {
        int count = 0;
        Node cur = head;
        if (index < 0 || index > num()-1) {
            System.out.println("位置有误");
            return -1;
        }
        while (count != index) {
            count++;
            cur = cur.next;
        }
        return cur.val;
    }

    /** Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list. */
    public void addAtHead(int val) {
        Node node = new Node();
        if (head == null ) {
            head = node;
            head.val = val;
            return;
        }
        node.next = head;
        node.val = val;
        head = node;
    }

    /** Append a node of value val to the last element of the linked list. */
    public void addAtTail(int val) {
        Node node = new Node();
        if (head == null) {
            head = node;
            head.val = val;
            return;
        }
        Node cur = head;
        while (cur.next != null){
            cur = cur.next;
        }
        cur.next = node;
        cur.next.val = val;
    }

    /** Add a node of value val before the index-th node in the linked list. If index equals to the length of linked list, the node will be appended to the end of linked list. If index is greater than the length, the node will not be inserted. */
    public void addAtIndex(int index, int val) {
        if (index < 0 || index > num()) {
            System.out.println("位置有误");
            return;
        }
        if (head == null || index == (num())) {
            addAtTail(val);
            return;
        }
        if (index == 0) {
            addAtHead(val);
            return;
        }
        int count = 0;
        Node cur = head;
        Node cur1 = new Node();
        Node cur2 = head;
        while (count != index){
            cur2 = cur;
            cur = cur.next;
            count++;
        }
        cur1.next = cur;
        cur2.next = cur1;
        cur1.val = val;
    }

    /** Delete the index-th node in the linked list, if the index is valid. */
    public void deleteAtIndex(int index) {
        if (index < 0 || index > num()-1) {
            System.out.println("位置有误");
            return;
        }
        if (head == null){
            return;
        }
        int count = 0;
        Node cur = head;
        Node cur1 = cur;
        while (count != index) {
            cur1 = cur;
            cur = cur.next;
            count++;
        }
        cur1.next = cur.next;
        if (index == 0) {
            head = head.next;
        }
    }
}