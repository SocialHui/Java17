package thread.thread0506;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Test27 {
    public static void main(String[] args) throws InterruptedException {

        Lock lock = new ReentrantLock(true);

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (char ch : "ABCD".toCharArray()) {
                    lock.lock();
                    try {
                        System.out.print(ch);
                    } finally {
                        lock.unlock();
                    }
                }
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (char ch : "ABCD".toCharArray()) {
                    lock.lock();
                    try {
                        System.out.print(ch);
                    } finally {
                        lock.unlock();
                    }
                }
            }
        });

        //等待两个线程加载完
        Thread.sleep(100);

        //启动线程
        t1.start();
        t2.start();

    }
}
