
class Node {
    public int val;
    public Node next;
    public Node(){

    }
    public Node(int val) {
        this.val = val;
    }
}

public class MyLikedList {
    public Node head;//当前链表的头

    //产生一个单链表
    public void createLinkedList() {
        Node node1 = new Node(10);
        Node node2 = new Node(20);
        Node node3 = new Node(30);
        Node node4 = new Node(40);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        this.head = node1;
    }

    //打印单链表
    public void display() {
        Node cur = this.head;
        if (isEmpty()) {
            return;
        }
        while (cur.next != null) {
            System.out.print(cur.val + " ");
            cur = cur.next;
        }
        System.out.println();
    }

    //判断链表共有多少个节点
    public int muchNode() {
        Node cur = this.head;
        int count = 0;
        while (cur.next != null) {
            cur = cur.next;
            count++;
        }
        return count;
    }

    //判断单链表是否为空
    public boolean isEmpty() {
        if (this.head == null) {
            return true;
        }
        return false;
    }

    //找到链表的最后一个节点,返回最后一个节点的地址
    public Node findLastNode() {
        if (isEmpty()) {
            return null;
        }
        Node val = this.head;
        while (val.next != null) {
            val = val.next;
        }
        return val;
    }

    //找到链表的倒数第二个节点
    public Node findLastTwo() {
        if (isEmpty()) {
            System.out.println("链表为空");
            return null;
        }
        if (this.head.next == null) {
            System.out.println("链表只有一个元素");
            return null;
        }
        Node val = this.head;
        while (val.next.next != null) {
            val = val.next;
        }
        return val;
    }

    //找到链表的第n个节点
    public int findNnode(int n) {
        if (isEmpty()) {
            System.out.println("链表空");
            return -1;
        }
        if (n > muchNode()) {
            System.out.println("查找的位置不正确");
            return -1;
        }
        int count = 1;
        Node cur = this.head;
        while (count != n) {
            if (count != n) {
                cur = cur.next;
                count++;
            }
        }
        return cur.val;
    }

    //找到链表中是否包含某个元素
    public boolean include(int n) {
        if (isEmpty()){
            System.out.println("链表是空的，没有元素");
            return false;
        }
        Node cur = this.head;
        while (cur != null) {
            if (cur.val == n){
                return true;
            }
            cur = cur.next;
        }
        return false;
    }


}
