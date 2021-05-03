package thread.thread0424;

public class Test6 {
    public static void main(String[] args) {
        //写法四：
        //创建匿名类
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("线程名："+Thread.currentThread().getName());
            }
        });
        thread.start();
    }
}
