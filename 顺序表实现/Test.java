public class Test {
    public static void main(String[] args) {
        MyArrayList myArrayList = new MyArrayList();
        myArrayList.add(8);
        myArrayList.setPos(6,200);
        myArrayList.disPlay();
        myArrayList.add(2,100);
        boolean shiFou = myArrayList.contains(66);
        if (shiFou == true) {
            System.out.println("包含");
        } else {
            System.out.println("不包含");
        }
        System.out.println(myArrayList.search(100));
        System.out.println(myArrayList.getPos(2));
        System.out.println(myArrayList.size());
        myArrayList.remove(100);
    }
}
