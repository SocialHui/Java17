public class Test4 {

    //单例模式之懒汉模式

    static class Single {
        private Single(){}

        private static volatile Single single = null;

        public static Single getSingle() {
            if (single == null) {
                synchronized (Object.class) {
                    if (single == null) {
                        single = new Single();
                    }
                }
            }
            return single;
        }
    }

    static Single single = null;
    static Single single2 = null;

    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                single = Single.getSingle();
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                single2 = Single.getSingle();
            }
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println(single == single2);
    }
}
