package thread.thread0522;

import org.omg.CORBA.UShortSeqHelper;

/**
 * 单例模式之懒汉方式
 */
public class ThreadDemo85 {
    static class Singleton{
        //1.设置私有的构造函数
        private Singleton(){}

        //2.提供一个私有的静态变量
        private static Singleton singleton = null;

        //3.提供给外部调用
        public static Singleton getInstance() {
            if (singleton == null) {
                //第一次访问，进行实例化
                singleton = new Singleton();
            }
            return singleton;
        }
    }

    private static Singleton s1 = null;
    private static Singleton s2 = null;

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
