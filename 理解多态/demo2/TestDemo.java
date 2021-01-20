package demo2;

abstract class Shape {  //抽象类
    abstract public void draw();//抽象方法,不需要具体的实现，也不能有具体的实现
}

/**
 * 普通类继承了抽象类的时候，一定要重写抽象类中的抽象方法
 */
class Rect extends Shape {
    @Override
    public void draw() {
        System.out.println("♦");
    }
}

class Circle extends Shape {
    @Override
    public void draw() {
        System.out.println("○");
    }
}

class Flower extends Shape {
    @Override
    public void draw() {
        System.out.println("❀");
    }
}


public class TestDemo{
    public static void drawMap(Shape shape){
        shape.draw();//运行时绑定
    }

    public static void main(String[] args) {
        drawMap(new Flower());//抽象类也可以发生向上转型
    }
}
