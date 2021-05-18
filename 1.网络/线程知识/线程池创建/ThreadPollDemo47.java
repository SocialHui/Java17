package thread.thread0518;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 2种方式
 * 线程池创建的7种写法
 */

public class ThreadPollDemo47 {
    public static void main(String[] args) {
        // 创建方式1.创建固定个数的线程池
        ExecutorService executorService = Executors.newFixedThreadPool(10);

        //执行任务
        executorService.execute(new Runnable() {    //传递Runnable任务
            @Override
            public void run() {
                System.out.println("线程名"+Thread.currentThread().getName());
            }
        });

        //执行第二个任务
        //可以执行多个任务
        executorService.execute(new Runnable() {
            @Override
            public void run() {
                System.out.println("线程名"+Thread.currentThread().getName());
            }
        });

        //当运行的程序比线程池的数量多的时候，就会利用前面已经创建好的线程执行任务
    }
}
