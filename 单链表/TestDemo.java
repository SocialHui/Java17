

public class TestDemo{
    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();
    }
}

class Node {

    public int val;
    public Node next;

    public Node (int value){
        val = value;
    }

}


class MyLinkedList {

    Node head;

    /** Initialize your data structure here. */
    public MyLinkedList() {

    }

    public int size() {
        Node cur = head;
        int count = 0;
        while (cur != null) {
            count++;
            cur = cur.next;
        }
        return count;
    }

    /** Get the value of the index-th node in the linked list. If the index is invalid, return -1. */
    public int get(int index) {
        if (index < 0 || index >= size()) {
            return -1;
        }
        Node cur = head;
        while (index != 0) {
            cur = cur.next;
            index--;
        }
        return cur.val;
    }

    /** Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list. */
    public void addAtHead(int val) {
        Node cur = new Node(val);
        if (head == null) {
            head = cur;
            return;
        }
        cur.next = head;
        head = cur;
    }

    /** Append a node of value val to the last element of the linked list. */
    public void addAtTail(int val) {
        Node cur = new Node(val);
        if (head == null) {
            head = cur;
            return;
        }
        Node node = head;
        while (node.next != null) {
            node = node.next;
        }
        node.next = cur;
    }

    /** Add a node of value val before the index-th node in the linked list. If index equals to the length of linked list, the node will be appended to the end of linked list. If index is greater than the length, the node will not be inserted. */
    public void addAtIndex(int index, int val) {
        if (index > size()) {
            return;
        }
        Node node = new Node(val);
        Node cur = head;
        //尾插
        if (index == size()) {
            addAtTail(val);
            return;
        }
        if (index <= 0) {
            addAtHead(val);
            return;
        }
        while (index-1 != 0) {
            cur = cur.next;
            index--;
        }
        node.next = cur.next;
        cur.next = node;
    }

    /** Delete the index-th node in the linked list, if the index is valid. */
    public void deleteAtIndex(int index) {
        if (index < 0 || index >= size()) return;
        if (index == 0) {
            head = head.next;
            return;
        }
        Node cur = head;
        while (index-1 != 0) {
            cur = cur.next;
            index--;
        }
        cur.next = cur.next.next;
    }
}

