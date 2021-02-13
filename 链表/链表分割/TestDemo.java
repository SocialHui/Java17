
public class TestDemo {
    public static void main(String[] args) {
        //链表分割
        //编写代码，以给定值x为基准将链表分割成两部分，所有小于x的结点排在大于或等于x的结点之前
        FenGe fenGe = new FenGe();
        fenGe.addFirst(10);
        fenGe.addFirst(20);
        fenGe.addFirst(30);
        fenGe.addFirst(5);
        fenGe.addFirst(6);
        fenGe.addFirst(8);
        fenGe.addFirst(50);
        fenGe.display();
        fenGe.addLast(7);
        fenGe.addLast(3);
        fenGe.display();
        fenGe.ge(10);
    }
}
