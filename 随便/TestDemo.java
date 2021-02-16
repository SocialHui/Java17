public class TestDemo {
    public static void main(String[] args) {
        DoubleLinkedList doubleLinkedList = new DoubleLinkedList();
        doubleLinkedList.addFirst(10);
        doubleLinkedList.addFirst(20);
        doubleLinkedList.addFirst(30);
        doubleLinkedList.addFirst(40);
        doubleLinkedList.disPlay();
        doubleLinkedList.addLast(50);
        doubleLinkedList.addLast(60);
        doubleLinkedList.disPlay();
    }
}
