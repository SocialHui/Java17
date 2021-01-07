public class Test {
    public static void main(String[] args) {
        myLinkList linkList = new myLinkList();
        linkList.created();
        linkList.print();
        Node node = linkList.toFindLast();
        System.out.println(node.data);
        Node node1 = linkList.toFindLastTwo();
        System.out.println(node1.data);
        //int n = 2;
        //Node node2 = linkList.toFindN(n);
        System.out.println(linkList.houMuch());
        Node node2 = linkList.toFindN(2);
        System.out.println(node2.data);
        int n = linkList.toFind(10);
        if (n == -1) {
            System.out.println("不包含");
        } else {
            System.out.println("包含");
        }
        linkList.addFirstNode(100);
        linkList.print();
        linkList.addFirstNode(200);
        linkList.print();
    }
}
