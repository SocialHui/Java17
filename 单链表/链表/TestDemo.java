import java.util.Arrays;

public class TestDemo {

    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.addAtHead(10);
        myLinkedList.addAtHead(20);
        myLinkedList.addAtHead(30);
        myLinkedList.addAtHead(40);
        myLinkedList.addAtTail(100);
        myLinkedList.addAtTail(200);
        System.out.println(myLinkedList.num());
        myLinkedList.disPlay();
        System.out.println(myLinkedList.get(5));
        myLinkedList.addAtIndex(6,222);
        myLinkedList.disPlay();
        myLinkedList.deleteAtIndex(1);
        myLinkedList.disPlay();
        myLinkedList.deleteAtIndex(1);
        myLinkedList.disPlay();
        myLinkedList.deleteAtIndex(0);
        myLinkedList.disPlay();
    }
}
