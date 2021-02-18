
class Animal {
    //public String name;

    public void eat(String name){
        System.out.println(name + " Animal eat ");
    }
}

class Dog extends Animal{

    public void eat(String name) {
        System.out.println(name + " Dog eat ");
    }

    public void func(){
        System.out.println("func()");
    }
}

public class TestDemo {
    public static void main(String[] args) {
        Animal animal = new Dog();  //向上转型
        animal.eat("wangcai");  //发生运行时绑定，打印Dog eat

        //Dog dog = new Dog();
        //dog.eat();

        //animal.func();     //错误的
        //Dog dog = (Dog) new Animal();  //向下转型
    }
}
