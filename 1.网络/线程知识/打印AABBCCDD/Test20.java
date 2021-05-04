package thread.thread0504;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Test20 {
    public static void main(String[] args) throws InterruptedException {
        //创建一个公平锁
        Lock lock = new ReentrantLock(true);

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                for (char ch:"ABCD".toCharArray()) {
                    lock.lock();
                    try{
                        System.out.print(ch);
                    } finally {
                        lock.unlock();
                    }

                }
            }
        };
        Thread t1 = new Thread(runnable);
        Thread t2 = new Thread(runnable);

        //休眠一段时间等待两个线程启动
        //Thread.sleep(100);

        t1.start();
        t2.start();

    }
}
