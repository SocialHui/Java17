public class TestDemo {
    public static void main(String args[]) {
        MyArrayList myArrayList = new MyArrayList();
        MyArrayList myArrayList1 = new MyArrayList(20);
        myArrayList.add(0,10);
        myArrayList.add(1,20);
        myArrayList.add(2,30);
        myArrayList.display();
        myArrayList.addLast(100);
        myArrayList.display();
    }
}

