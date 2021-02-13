
class Node {
    public int val;
    public Node next;

    public Node() {

    }

    public Node (int val) {
        this.val = val;
    }
}

public class MyLinkedList {

    public Node head;

    public void createdList() {
        Node node1 = new Node(10);
        Node node2 = new Node(20);
        Node node3 = new Node(30);
        Node node4 = new Node(40);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        this.head = node1;
    }

    public void display() {
        if (head == null) return;
        Node cur = new Node();
        cur = head;
        while (cur != null) {
            System.out.print(cur.val + " ");
            cur = cur.next;
        }
        System.out.println();
    }

    public Node findLastNode () {
        if (head == null) return null;
        Node cur = new Node();
        cur = head;
        while (cur.next != null) {
            cur = cur.next;
        }
        return cur;
    }

    public Node findLastTwoNode () {
        if (head == null) {
            return null;
        }
        Node cur = new Node();
        cur = head;
        if (cur.next == null) {
            System.out.println("只有一个节点，没有倒数第二个节点");
            return null;
        }
        while (cur.next.next != null) {
            cur = cur.next;
        }
        return cur;
    }

    public int size() {
        Node cur = new Node();
        cur = head;
        int count = 0;
        while (cur != null) {
            count++;
            cur = cur.next;
        }
        return count;
    }

    public Node findN(int n) {
        if (n < 0 || n > size()) return null;
        int count  = 1;
        Node cur = new Node();
        cur = head;
        while (count != n) {
            count++;
            cur = cur.next;
        }
        return cur;
    }

    public boolean contains(int key) {
        if (head == null) return false;
        Node cur = new Node();
        cur = head;
        while (cur != null) {
            if (cur.val == key) {
                return true;
            }
            cur = cur.next;
        }
        return false;
    }

    public void addFirst(int val) {
        Node node = new Node(val);
        if (head == null) {
            head = node;
        } else {
            node.next = head;
            head = node;
        }
    }

    public void addLast(int val) {
        Node node = new Node(val);
        if (head == null) {
            head = node;
        } else {
            Node cur = new Node();
            cur = findLastNode();
            cur.next = node;
        }
    }

    public void addN(int n, int val) {
        if (n < 0 || n > size()) return;
        Node node = new Node(val);
        Node cur = new Node();
        cur = head;
        int count = 0;
        while (count != n - 1) {
            count++;
            cur = cur.next;
        }
        node.next = cur.next;
        cur.next = node;
    }

    public void remove(int key) {
        if (!contains(key)) return;
        if (key == head.val) {
            head = head.next;
            return;
        }
        Node cur = new Node();
        cur = head;
        while (cur.next.val != key) {
            cur = cur.next;
        }
        cur.next = cur.next.next;
    }

    public void removeAllKey(int key) {
        Node cur = new Node();
        cur = head;
        while (cur != null) {
            remove(key);
            cur = cur.next;
        }
    }

    public void clear() {
        head = null;
    }

    //输入一个链表，输出该链表中倒数第k个结点
    public Node findLastKNode(int k) {
        int num = size()-k+1;//代表正着数是第几个
        int count = 1;
        Node cur = this.head;
        while (count != num) {
            cur = cur.next;
            count++;
        }
        return cur;
    }

    //返回链表的中间结点
    public Node findZNode () {
        int num = size()/2 + 1;
        int count = 1;
        Node cur = this.head;
        while (count != num) {
            cur = cur.next;
            count++;
        }
        return cur;
    }

    //反转一个单链表
    public Node fanZ () {
        Node cur = this.head;
        Node newHead = new Node(this.head.val);
        cur = cur.next;
        while (cur != null) {
            //头插法
            Node cur2 = new Node(cur.val);
            cur2.next = newHead;
            newHead = cur2;
            cur = cur.next;
        }
        return newHead;
    }

}
