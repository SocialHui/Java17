public class Test3 {

    //单例模式有两种
    //饿汉模式和懒汉模式，饿汉模式不存在线程安全的问题

    static class Singleton{
        private Singleton() {

        }

        private static Singleton singleton = new Singleton();

        public static Singleton getSingleton() {
            return singleton;
        }
    }

    static Singleton singleton = null;
    static Singleton singleton1 = null;

    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                singleton = Singleton.getSingleton();
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                singleton1 = Singleton.getSingleton();
            }
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println(singleton == singleton1);
    }
}
