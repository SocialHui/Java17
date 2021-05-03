package thread.thread0424;

public class Test7 {
    public static void main(String[] args) {
        //jdk8及以后才可以使用
        //写法五：
        Thread thread = new Thread(()->{
            System.out.println("线程名："+Thread.currentThread().getName());
        });
        thread.start();
    }
}
