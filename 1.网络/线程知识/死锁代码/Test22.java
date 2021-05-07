package thread.thread0506;

/**
 * 手写死锁代码
 */
public class Test22 {
    public static void main(String[] args) {
        //创建锁
        Object lockA = new Object();
        Object lockB = new Object();

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (lockA) {
                    System.out.println("t1获取了自己的对象");
                    synchronized (lockB) {
                        System.out.println("尝试获取t2的对象");
                    }
                }
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (lockB) {
                    System.out.println("t2获取了自己的对象");
                    synchronized (lockA) {
                        System.out.println("尝试获取t1的对象");
                    }
                }
            }
        });
        t2.start();
        t1.start();
    }
}
