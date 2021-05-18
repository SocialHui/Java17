package thread.thread0518;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPollDemo52 {

    public static void main(String[] args) {
        //创建方式5： 创建单个线程
        ExecutorService service = Executors.newSingleThreadExecutor();  //单纯创建线程池
        for (int i = 0; i < 10; i++) {
            service.execute(new Runnable() {
                @Override
                public void run() {
                    System.out.println("线程名："+Thread.currentThread().getName());
                }
            });
        }
    }
}

/**
 * 经典面试题：创建单个线程池有什么作用？
 * 1.可以避免频繁创建和消耗线程带来的性能开销
 * 2.有任务队列可以存储多余的任务，
 * 3.当有大量的任务不能处理的时候可以有好的拒绝执行策略
 * 4.单个线程池可以更好的管理任务（可以保证任务的顺序）
 */
