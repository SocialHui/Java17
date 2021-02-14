public class TestDemo {
    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.createdLinked();
        System.out.println(myLinkedList.findLastKNode(6).val);
    }
}
