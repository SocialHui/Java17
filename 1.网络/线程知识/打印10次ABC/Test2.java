package thread.thread0504;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Test21 {
    public static void main(String[] args) throws InterruptedException {

        //设置为true代表是公平锁，可以按照自己的想法来实现
        Lock lock = new ReentrantLock(true);

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                lock.lock();
                try{
                    System.out.print("A");
                } finally {
                    lock.unlock();
                }
            }
        };

        Runnable runnable1 = new Runnable() {
            @Override
            public void run() {
                lock.lock();
                try {
                    System.out.print("B");
                } finally {
                    lock.unlock();
                }
            }
        };

        Runnable runnable2 = new Runnable() {
            @Override
            public void run() {
                lock.lock();
                try {
                    System.out.print("C");
                    System.out.println();
                } finally {
                    lock.unlock();
                }
            }
        };

        for (int i = 0; i < 10; i++) {
            Thread t1 = new Thread(runnable);
            Thread t2 = new Thread(runnable1);
            Thread t3 = new Thread(runnable2);

            //这样写并不能保证打印的顺序是ABC 打印 10次， 因为我上锁的对象是 打印的ABC，而这样启动不能保证按顺序启动

            t1.start();
            t2.start();
            t3.start();
        }
    }
}
