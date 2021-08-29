public class Test2 {
    public static void main(String[] args) throws InterruptedException {
        //死锁的代码
        Object s1 = new Object();
        Object s2 = new Object();

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (s1) {
                    /*try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }*/
                    System.out.println("1获得了1");
                    synchronized (s2) {
                        System.out.println("1尝试去获取2锁");
                    }
                }
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (s2) {
                    /*try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }*/
                    System.out.println("2获取了2");
                    synchronized (s1) {
                        System.out.println("2去获取1");
                    }
                }
            }
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();

    }
}
