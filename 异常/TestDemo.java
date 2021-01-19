import javafx.scene.chart.ScatterChart;
//运行时期的异常   RuntimeException
class MyException extends RuntimeException{   //自定义异常
    private String message;

    public MyException(String message) {   //构造方法的参数就是错误的原因
        super(message);
    }
}
//编译时期的异常   Exception
class MyException2 extends Exception {
    public MyException2(String message) {
        super (message);
    }
}

public class TestDemo {

    public static void main(String[] args) {
        int a = 10;
        /*
        if (a == 10) {
            throw new MyException2("bit");    //此时这是编译时异常，不是运行时异常
        } else {

        }*/

        try {
            if (a == 10) {
                throw new MyException2("bit");    //此时这是是运行时异常,被try catch包裹了
            } else {

            }
        } catch (MyException2 e) {
            e.printStackTrace();
        }

    }

    public static void main2(String[] args) {
        try {
            throw new MyException("bit");
        } catch (MyException e) {
            e.printStackTrace();
        }
    }

    public static void main1(String[] args) {
        try {
            //System.out.println(10/0);  //捕捉到异常直接到catch，不会执行下面的语句
            throw new ArithmeticException("by ze");  //抛出异常,括号里面的就是异常的原因
        } catch (ArithmeticException e) {
            e.printStackTrace();   //打印错误的原因
        }
    }
}
