package thread.thread0504;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Test19 {
    //全局的变量
    private static int number = 0;

    //循环次数
    private static final int n = 1000000;
    public static void main(String[] args) throws InterruptedException {
        //1.创建锁  Lock是一个接口，不可以new自己
        Lock lock = new ReentrantLock();

        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                //2.加锁
                lock.lock();
                try{
                    number++;
                } finally {
                    //3.释放锁
                    lock.unlock();
                }
            }
        });
        thread.start();

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                //加锁
                lock.lock();
                try{
                    number--;
                }finally {
                    //释放锁
                    lock.unlock();
                }
            }
        });
        thread1.start();

        //等待两个线程执行结束
        thread.join();
        thread1.join();

        System.out.println("最终的执行结果是："+number);
    }
}
