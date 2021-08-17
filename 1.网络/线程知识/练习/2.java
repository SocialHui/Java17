package thread.thread0810;

public class Test3 {
    static class Singleton{
        private Singleton() {};

        private static Singleton singleton = null;

        public static Singleton getSingleton() throws InterruptedException {
            if (singleton == null) {
                Thread.sleep(1000);
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
                try {
                    s1 = Singleton.getSingleton();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        t1.start();

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    s2 = Singleton.getSingleton();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        t2.start();

        t1.join();
        t2.join();

        System.out.println(s1 == s2);
    }
}
