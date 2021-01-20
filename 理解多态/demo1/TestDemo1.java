package demo1;

class Shape{
    public void draw() {

    }
}

class Rect extends Shape {
    @Override
    public void draw() {
        System.out.println("♦");
    }
}

class Circle extends Shape{
    @Override
    public void draw() {
        System.out.println("○");
    }
}

class Flower extends Shape{
    @Override
    public void draw() {
        System.out.println("❀");
    }
}


public class TestDemo1 {

    public static void drawMap(Shape shape) {
        shape.draw();//发生运行时绑定
    }

    public static void main(String[] args) {

        Shape shape = new Circle();//赋值发生向上转型
        shape.draw();//运行时绑定，打印○
        Shape shape1 = new Flower();
        shape1.draw();

        drawMap(new Circle());//方法传参发生向上转型
        drawMap(new Flower());
        drawMap(new Rect());
    }

}
