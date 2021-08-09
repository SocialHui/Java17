package thread.thread0809;

public class Test9 {
    public static void main(String[] args) {
        Object lock1 = new Object();
        Object lock2 = new Object();

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (lock1) {
                    System.out.println("1");
                    synchronized (lock2) {
                        System.out.println("1"+"2");
                    }
                }
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (lock2) {
                    System.out.println("2");
                    synchronized (lock1) {
                        System.out.println("2"+"1");
                    }
                }
            }
        });

        t1.start();
        t2.start();
    }
}
