package demo3;
import demo3.IShape;

interface IShape{  //接口

    void draw(); //不能有具体的实现
    /*
    default void func() {
        System.out.println();
    }*/
}

class Rect implements IShape{
    @Override
    public void draw() {
        System.out.println("♦");
    }
}

public class TestDemo {
    public static void drawMap(IShape shape){
        shape.draw();//运行时绑定
    }

    public static void main(String[] args) {
        drawMap(new Rect());
        IShape shape = new Rect();
        shape.draw();
    }
}
