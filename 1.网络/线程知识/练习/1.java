package thread.thread0810;

public class Test2 {

    static class Singleton{
        private Singleton(){

        }

        private static Singleton singleton = null;

        public static Singleton getSingleton() {
            if (singleton == null) {
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
                s1 = Singleton.getSingleton();
            }
        });
        t1.start();

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                s2 = Singleton.getSingleton();
            }
        });
        t2.start();

        t1.join();
        t2.join();

        System.out.println(s1 == s2);
    }
}
