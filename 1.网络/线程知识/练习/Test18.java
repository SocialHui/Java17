package thread.thread0504;

//有20个线程，需要同时启动。
//每个线程按0-19的序号打印，如第一个线程需要打印0
//请设计代码，在main主线程中，等待所有子线程执行完后，再打印 ok

public class Test18 {
        public static void main(String[] args) throws InterruptedException {
            //有20个线程需要执行
            Thread[] threads = new Thread[20];

            for (int i = 0; i < 20; i++) {
                int n = i;
                threads[i] = new Thread(()->{
                    System.out.println(n);
                });
            }
            for (Thread t : threads) {
                t.start();
                t.join();
            }
            System.out.println("OK");
        }
/*    public static void main(String[] args) throws InterruptedException {
        Thread[] threads = new Thread[20];
        for (int i = 0; i < 20; i++) {
            final int n = i;
            threads[i] = new Thread(new Runnable() {
                @Override
                public void run() {//内部类使用外部的变量，必须是final修饰
                    System.out.println(n);
                }
            });
        }
        for (Thread t : threads) {
            t.start();
            t.join();
        }
        System.out.println("OK");
    }*/
}



