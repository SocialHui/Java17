package thread.thread0522;

/**
 * 单例模式之饿汉方式
 */
public class ThreadDemo84 {
    static class Singleton{
        //1.将构造函数设置为私有的，不让外部可见
        private Singleton(){

        }

        //2.创建静态的类变量（让底下的第三步方法返回）
        private static Singleton singleton = new Singleton();

        //3.给外部提供的获取单例的方法
        public static Singleton getInstance() {
            return singleton;
        }
    }

    static Singleton s1 = null;
    static Singleton s2 = null;

    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                s1 = Singleton.getInstance();
            }
        });
        t1.start();
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                s2 = Singleton.getInstance();
            }
        });
        t2.start();
        t1.join();
        t2.join();
        System.out.println(s1 == s2);

    }
}
