package thread.thread0518;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPollDemo54 {
    static  class MyOOMClass {
        private byte[] bytes = new byte[1*1024*1024];   //1M空间
    }
    public static void main(String[] args) throws InterruptedException {
        /**
         * 创建方式7：
         */
        Thread.sleep(15*1000);
        ExecutorService service = Executors.newCachedThreadPool();
        for (int i = 0; i < 15; i++) {
            final int I = i;
            service.execute(new Runnable() {
                @Override
                public void run() {
                    MyOOMClass myOOMClass = new MyOOMClass();
                    System.out.println("任务"+I);
                }
            });
        }
    }
}

/**
 * 线程池有两个重要的对象
 * 1.线程
 * 2.工作队列（大小：Integer.MAX_VALUE）
 *
 * 前六种创建线程池的方式可能会导致：
 * 1.线程数量不可控（比如创建带缓存的线程池时）
 * 2.工作任务量不可控（Integer.MAX_VALUE），可能会导致内存溢出
 */
