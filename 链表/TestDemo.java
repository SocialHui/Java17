
    public class TestDemo {
        public static void main(String[] args) {
            MyLikedList myLikedList = new MyLikedList();
            myLikedList.createLinkedList();
            myLikedList.display();
            Node node = myLikedList.findLastNode();
            System.out.println(myLikedList.muchNode());
            int n = myLikedList.findNnode(2);
            System.out.println(n);
            System.out.println(myLikedList.include(1));
        }
    }
