import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

class Student<T>{
    public String name;
    public String class1;
    public double score;

    public Student(String name, String class1, double score) {
        this.name = name;
        this.class1 = class1;
        this.score = score;
    }


    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", class1='" + class1 + '\'' +
                ", score=" + score +
                '}';
    }
}


public class TestDemo2 {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student("bit","17",99.9));
        list.add(new Student("bit1","18",97.9));
        list.add(new Student("bit2","18",98.9));
        list.add(new Student("bit3","17",91.9));
        //遍历打印
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        for(Student student : list){
            System.out.println(student);
        }
        System.out.println(list);

        /*
        list<String,String,Double> list1 = new list<>("bit1","17",88.5);
        list<String,String,Double> list2 = new list<>("bit1","17",88.5);
        list<String,String,Double> list3 = new list<>("bit1","17",88.5);
        list<String,String,Double> list4 = new list<>("bit1","17",88.5);
        System.out.println(list1);
        System.out.println(list2);
        System.out.println(list3);
        System.out.println(list4);*/
    }

    public static void main3(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        //迭代器   用来打印集合中的元素
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {  //判断是否有下一个
            System.out.println(iterator.next());
        }
        iterator.remove();  //慎用
        System.out.println(list);
        iterator.remove();
    }
    public static void main2(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        System.out.println(list);

        List<Integer> list1 = new ArrayList<>();
        list1 = list.subList(1, 3);       //此时的截取是浅拷贝，其实没有new新对象，改变截取的值得时候，原来的数组也改变了
        System.out.println(list1);
        list1.set(1,200);
        System.out.println(list1);

        System.out.println(list);
    }
    public static void main1(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println(list.get(1)); //20
        System.out.println(list);  //10 20 30
        list.add(1,100);
        System.out.println(list); //10 100 20 30

        List<Integer> arraylist = new ArrayList<>();
        arraylist.add(20);
        arraylist.add(30);

        list.addAll(arraylist);  //把arrayliat顺序表拼接在list的后面
        System.out.println(list);//10 100 20 30 20 30

        list.remove(0);//删除某个下标的值
        System.out.println(list);

        Integer integer = 100;
        list.remove(integer);   //删除出现的某个数字(必须是Objict类型)
        System.out.println(list);

        list.set(0,999);
        System.out.println(list);

        //List<String> list1 = new ArrayList<>();
        //list1.add("bit");
        //System.out.println(list1.get(0));
    }
}
