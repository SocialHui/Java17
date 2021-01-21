//泛型的理解
//泛型是编译时期的机制，运行过程中不参与

class MyArrayList<T> {

    public T[] elem;
    public int usedSize;

    public void add(T data) {
        elem[usedSize] = data;
        usedSize++;
    }

    public MyArrayList() {
        this.elem = (T[])new Object[10];
    }

    public T get(int pos){
        return elem[pos];
    }
}
/*
class A<T>{   //泛型类
    T value;

    A(T value) {
        this.value = value;
    }

    T get() {
        return value;
    }
}*/

public class TestDemo {

    public static void main3(String[] args) {
        A<Integer> i = new A<Integer>(10);
        int j = i.get();
        System.out.println(j);

        A<Double> m = new A<>(12.3);
        System.out.println(m.get());

        A<String> str = new A<>("bit");
        System.out.println(str.get());
    }

    public static void main2(String[] args) {

        MyArrayList<Integer> myArrayList = new MyArrayList<>();//泛型类型参数不能是简单类型
        myArrayList.add(10);

        MyArrayList<Double> myArrayList1 = new MyArrayList<>();
        myArrayList1.add(12.365);

        MyArrayList<String> myArrayList2 = new MyArrayList<>();
        myArrayList2.add("nihaobit");
        //myArrayList2.add(23); //自动进行类型检查

        int num = myArrayList.get(0);  //编译器自动进行类型转换
        System.out.println(num);
        String str = myArrayList2.get(2);
    }

    public static void main1(String[] args) {
        MyArrayList myArrayList = new MyArrayList();
        myArrayList.add(10);
        myArrayList.add("123456");

        String str = (String) myArrayList.get(1);  //发生向下转型,需要强制类型转换
    }
}


