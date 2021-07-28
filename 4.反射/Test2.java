import java.io.File;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

class Student {
    private String name;   //私有属性
    public int age;  //共有属性

    //公共的构造方法
    public Student(){
        int a = 10;
        System.out.println("Student()");
    }

    //私有的构造方法
    private Student(String name, int age){
        this.name = name;
        this.age = age;
        System.out.println("Student(name,age)");
    }

    //私有方法
    private void eat() {
        System.out.println("正在吃");
    }

    //共有的方法
    public void run() {
        System.out.println("正在跑");
    }

    //带一个参数的私有的方法
    private void function(String str) {
        System.out.println(str);
    }

    //重写的方法
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

public class Test2{

    //创建对象
    public static void create() {
        try {
            Class<?> c1 = Class.forName("Student");   //获得class对象
            Object objectStudent = c1.newInstance();    //创建类的实例，调用不带有参数的构造方法
            Student student = (Student)objectStudent;
            System.out.println("获得student对象"+student);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //反射私有的构造方法
    public static void reflectPrivateConstructor() {
        try {
            Class<?> c2 = Class.forName("Student");   //获得class对象
            Constructor<?> constructor = c2.getDeclaredConstructor(String.class,int.class);
            //反射私有的属性或者方法的时候，都需要修改访问权限
            constructor.setAccessible(true);
            Object object = constructor.newInstance("盛慧",20);
            Student student = (Student)object;
            System.out.println("获得私有的构造函数并且修改年龄和姓名: "+student);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //反射私有属性
    public static void reflectPrivateField() {
        try {
            Class<?> c3 = Class.forName("Student");
            Field field = c3.getDeclaredField("name");
            field.setAccessible(true);
            Object object = c3.newInstance();
            Student student = (Student)object;

            field.set(student,"小明");

            String name = (String)field.get(student);
            System.out.println("修改了私有属性name："+name);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //反射私有方法
    public static void reflectPrivateMethod() {
        try {
            Class<?> c4 = Class.forName("Student");
            Method method = c4.getDeclaredMethod("function",String.class);   //私有方法的名称和方法参数
            System.out.println("私有方法的名称为："+method.getName());
            method.setAccessible(true);
            Object object = c4.newInstance();
            Student student = (Student)object;
            method.invoke(student,"给私有的函数传的参数");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public static void main(String[] args) {
        //create();
        //reflectPrivateConstructor();
        //reflectPrivateField();
        reflectPrivateMethod();



/*        //通过getClass获得class对象
        Student s1 = new Student();
        Class<?> c1 = s1.getClass();

        //通过类名.class获得class对象
        Class<?> c2 = Student.class;

        //通过Class对象的forName()静态方法来获取
        Class<?> c3 = null;
        try {
            Class.forName("Student");   //可能会抛出异常，所以用try catch包裹
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }


        System.out.println(c1.equals(c3));
        System.out.println(c1.equals(c3));
        System.out.println(c2.equals(c3));*/
    }
}
