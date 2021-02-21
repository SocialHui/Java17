import java.util.ArrayList;

public class TestDemo {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<Student>(10);
        Student student1 = new Student("zhangsan",88,"1");
        Student student2 = new Student("wang",99,"2");
        Student student3 = new Student("bit",97,"5");
        Student student4 = new Student("sheng",100,"8");
        list.add(student1);
        list.add(student2);
        list.add(student3);
        list.add(student4);
        System.out.println(list);
    }
}

class Student {
    public String name;
    public double score;
    public String classes;

    public Student(String name, double score, String classes) {
        this.name = name;
        this.score = score;
        this.classes = classes;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", score=" + score +
                ", classes='" + classes + '\'' +
                '}';
    }
}

