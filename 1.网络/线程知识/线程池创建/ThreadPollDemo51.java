package thread.thread0518;

import java.util.Date;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ThreadPollDemo51 {
    public static void main(String[] args) {
        /**
         * 创建线程池方式4： 创建单个执行定时任务的线程池
         * 以上一次任务结束时间作为这次任务的开始时间的
         * 第三种创建方式的单机版本
         */
        ScheduledExecutorService service = Executors.newSingleThreadScheduledExecutor();  //创建单个线程执行定时任务
        service.scheduleWithFixedDelay(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("执行任务："+new Date());
            }
        },1,3, TimeUnit.SECONDS);
    }
}
