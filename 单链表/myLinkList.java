class Node {
    public int data;
    public Node next;

    public Node() {
    }

    public Node(int data) {
        this.data = data;
    }
}

public class myLinkList {
    public Node head;
    //创建一个单链表
    public void created() {
        this.head = new Node(10);
        Node node2 = new Node(20);
        Node node3 = new Node(30);
        Node node4 = new Node(40);
        head.next = node2;
        node2.next = node3;
        node3.next = node4;
    }

    //判断单链表是否为空
    public boolean isNoNum() {
        Node cur = new Node();
        cur = this.head;
        if (cur == null) {
            return true;
        } else {
            return false;
        }
    }

    //打印单链表
    public void print () {
        Node cur = new Node();
        cur = this.head;
        while (cur != null) {
            System.out.print(cur.data+" ");
            cur = cur.next;
        }
        System.out.println();
    }

    //找到最后一个节点，并返回其节点的引用
    public Node toFindLast() {
        if (this.head==null) {
            System.out.println("链表为空");
            return null;
        }
        Node cur = new Node();
        cur = this.head;
        while (cur.next != null) {
            cur = cur.next;
        }
        return cur;
    }

    //找到链表的倒数第二个节点
    public Node toFindLastTwo () {
        if (this.head.next == null) {
            System.out.println("链表没有两个节点");
            return null;
        }
        Node cur = new Node();
        cur = this.head;
        while (cur.next.next != null) {
            cur = cur.next;
        }
        return cur;
    }

    //链表有几个节点
    public int houMuch() {
        int count = 0;
        Node cur = new Node();
        cur = this.head;
        while (cur != null) {
            cur = cur.next;
            count++;
        }
        return count;
    }


    //找到链表的第n个节点
    public Node toFindN(int n) {
        if (n <= 0 || n > houMuch()) {
            System.out.println("没有这个节点");
            return null;
        }
        Node cur = new Node();
        cur = this.head;
        int count = 1;
        while (count != n) {
            count++;
            cur = cur.next;
        }
        return cur;
    }

    //找到链表中是否包含某个元素
    public int toFind(int n) {
        Node cur = new Node();
        cur = this.head;
        while (cur != null) {
            if (cur.data == n) {
                return 1;
            }
            cur = cur.next;
        }
        return -1;
    }

}
