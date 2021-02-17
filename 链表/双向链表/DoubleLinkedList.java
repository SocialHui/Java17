
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

    public void addIndex(int index, int data) {
        if (index < 0 || index > size()) return;
        if (index == 0) {
            //头插法
            addFirst(data);
            return;
        }
        if (index == size()) {
            //尾插法
            addLast(data);
            return;
        }
        ListNode node = new ListNode(data);
        ListNode cur = this.head;
        int count = 1;
        while (count != index) {
            cur = cur.getNext();
            count++;
        }
        cur.getNext().setPrev(node);
        node.setNext(cur.getNext());
        node.setPrev(cur);
        cur.setNext(node);
    }

    public int size() {
        ListNode cur = this.head;
        int count = 0;
        while (cur != null) {
            count++;
            cur = cur.getNext();
        }
        return count;
    }

    public boolean contains(int data) {
        ListNode cur = this.head;
        while (cur != null) {
            if (cur.getVal() == data) {
                return true;
            }
            cur = cur.getNext();
        }
        return false;
    }

    public void remove(int key) {
        if (this.head.getVal() == key) {
            //删头
            this.head = this.head.getNext();
            this.head.setPrev(null);
            return;
        }
        ListNode cur = this.head;
        while (cur != null) {
            if (cur == this.last && this.last.getVal() == key) {
                //删尾巴
                this.last = this.last.getPrev();
                this.last.setNext(null);
                return;
            }
            if (cur.getVal() == key) {
                cur.getPrev().setNext(cur.getNext());
                cur.getNext().setPrev(cur.getPrev());
                return;
            }
            cur = cur.getNext();
        }
    }

    public void removeAllKey(int key) {
//        ListNode cur = this.head;
//        while (cur != null) {
//            if (cur.getVal() == key) {
//                remove(key);
//            }
//            cur = cur.getNext();
//        }
        while (this.head.getVal() == key) {
            //删头
            this.head = this.head.getNext();
            this.head.setPrev(null);
        }
        while (this.last.getVal() == key) {
            //删尾巴
            this.last = this.last.getPrev();
            this.last.setNext(null);
        }
        ListNode cur = this.head;
        while (cur != null) {
            if (cur.getVal() == key) {
                cur.getPrev().setNext(cur.getNext());
                cur.getNext().setPrev(cur.getPrev());
            }
            cur = cur.getNext();
        }
    }

    public void clear() {
        this.head = null;
        this.last = null;
    }
    
}









