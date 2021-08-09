package thread.thread0809;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 线程池的创建
 */

public class Test5 {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(10);

        executorService.execute(new Runnable() {
            @Override
            public void run() {
                System.out.println("创建的线程池里面的第一个任务");
            }
        });

        executorService.execute(new Runnable() {
            @Override
            public void run() {
                System.out.println("创建的线程池里面执行的第二个任务");
            }
        });
    }
}
