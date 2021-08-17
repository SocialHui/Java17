package thread.thread0810;

public class Test1 {

    static class Singleton{

        //首先将单例模式的构造方法设为私有的，因为构造方法默认是public的，所以要写为私有的覆盖
        private Singleton() {

        }

        //然后创建一个私有的静态的类变量，在下面的方法中返回
        private static Singleton singleton = new Singleton();

        //返回类变量
        public static Singleton getSingleton() {
            return singleton;
        }

    }


    static Singleton s1 = null;
    static Singleton s2 = null;

    public static void main(String[] args) throws InterruptedException {


        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                s1 = Singleton.getSingleton();
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                s2 = Singleton.getSingleton();
            }
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println(s1 == s2);
    }
}
