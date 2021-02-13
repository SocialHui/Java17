
public class TestDemo {
    public static void main(String[] args) {
        //输入一个链表，输出该链表中倒数第k个结点
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.createdList();
        myLinkedList.display();
        //System.out.println(myLinkedList.findLastKNode(2).val);
        System.out.println(myLinkedList.findZNode().val);
        Node node = myLinkedList.fanZ();
        while (node != null) {
            System.out.print(node.val + " ");
            node = node.next;
        }

    }
}




//删除链表中等于给定值 val 的所有节点
