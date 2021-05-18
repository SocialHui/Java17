package thread.thread0518;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPollDemo48 {
    public static void main(String[] args) {
        // 创建方式2 ：创建带缓存的线程池
        ExecutorService executorService = Executors.newCachedThreadPool();

        /**
         * 和创建固定大小线程池的区别：将线程缓存一段时间
         *
         * 前面的任务已经执行结束，就可以复用前面的空闲的线程了
         *
         * 使用场景：短期有大量任务的时候使用newCachedThreadPool()。
         */

        for (int i = 0; i < 10; i++) {
            executorService.execute(new Runnable() {
                @Override
                public void run() {
                    System.out.println("线程名："+Thread.currentThread().getName());
                }
            });
        }
    }
}
