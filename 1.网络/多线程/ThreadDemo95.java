package thread.thread0526;

import java.util.Date;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * 读写锁示例
 */
public class ThreadDemo95 {
    public static void main(String[] args) {
        //创建读写锁  可重入的读写锁   可以设置是否为公平锁，默认是非公平锁
        ReentrantReadWriteLock readWriteLock = new ReentrantReadWriteLock();

        //得到读锁
        ReentrantReadWriteLock.ReadLock readLock = readWriteLock.readLock();

        //得到写锁
        ReentrantReadWriteLock.WriteLock writeLock = readWriteLock.writeLock();

        //创建线程池
        ThreadPoolExecutor executor = new ThreadPoolExecutor(10,10,
                0, TimeUnit.SECONDS,new LinkedBlockingDeque<>(1000));

        //任务1  读锁演示
        executor.execute(new Runnable() {
            @Override
            public void run() {
                readLock.lock();  //加锁
                try {
                    System.out.println(Thread.currentThread().getName()+" 线程进入了读锁,时间："+new Date());
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    readLock.unlock();  //释放锁
                }
            }
        });

        //任务2  读锁演示
        executor.execute(new Runnable() {
            @Override
            public void run() {
                readLock.lock();  //加锁
                try {
                    System.out.println(Thread.currentThread().getName()+" 线程进入了读锁,时间："+new Date());
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    readLock.unlock();  //释放锁
                }
            }
        });
        //如果两个锁的打印时间间隔不超过1秒，说明读锁是可共享的，否则是不可共享的


        //任务3   写锁
        executor.execute(new Runnable() {
            @Override
            public void run() {
                writeLock.lock();
                try {
                    System.out.println(Thread.currentThread().getName()+" 执行了写锁，时间："+new Date());
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    writeLock.unlock();
                }
            }
        });

        //任务4   写锁
        executor.execute(new Runnable() {
            @Override
            public void run() {
                writeLock.lock();
                try {
                    System.out.println(Thread.currentThread().getName()+" 执行了写锁，时间："+new Date());
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    writeLock.unlock();
                }
            }
        });
        //如果两个锁的打印时间间隔不超过1秒，说明写锁是可共享的，否则是不可共享的（独占锁）
    }
}
