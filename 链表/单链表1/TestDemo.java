public class TestDemo {
    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.createdList();
        myLinkedList.display();
        Node node = myLinkedList.findLastNode();
        System.out.println(node.val);
        node = myLinkedList.findLastTwoNode();
        System.out.println(node.val);
        System.out.println(myLinkedList.size());
        node = myLinkedList.findN(4);
        System.out.println(node.val);
        System.out.println(myLinkedList.contains(100));
        myLinkedList.addFirst(100);
        myLinkedList.addFirst(200);
        myLinkedList.addFirst(300);
        myLinkedList.display();
        myLinkedList.addLast(1);
        myLinkedList.addLast(2);
        myLinkedList.addLast(3);
        myLinkedList.display();
        myLinkedList.addN(2,888);
        myLinkedList.display();
        myLinkedList.addLast(888);
        myLinkedList.display();
        myLinkedList.removeAllKey(888);
        myLinkedList.display();
        myLinkedList.remove(3);
        myLinkedList.display();
        myLinkedList.addN(2,50);
        myLinkedList.addN(2,50);
        myLinkedList.display();
//        myLinkedList.removeAllKey(50);
//        myLinkedList.display();
        myLinkedList.addFirst(300);
        myLinkedList.addLast(300);
        myLinkedList.addN(5,300);
        myLinkedList.display();
        myLinkedList.removeAllKey2(300);
        myLinkedList.display();
    }
}
