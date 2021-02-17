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
        doubleLinkedList.addLast(60);
        doubleLinkedList.addFirst(40);
        doubleLinkedList.addIndex(3,20);
        doubleLinkedList.addIndex(2,10);
        doubleLinkedList.disPlay();
//        doubleLinkedList.removeAllKey(60);
//        doubleLinkedList.disPlay();
        doubleLinkedList.remove(60);
        doubleLinkedList.disPlay();
//        System.out.println(doubleLinkedList.size());
//        doubleLinkedList.addIndex(0,100);
//        doubleLinkedList.disPlay();
//        System.out.println(doubleLinkedList.contains(60));

    }
}
