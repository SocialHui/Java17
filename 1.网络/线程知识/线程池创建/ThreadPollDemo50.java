package thread.thread0518;

import java.util.Date;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ThreadPollDemo50 {
    public static void main(String[] args) {
        /**
         * 创建方式3： 创建可以执行定时任务的线程池
         */
        ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(2);  //需要设置参数，线程池的个数   注意接收对象不同了

        System.out.println("设置定时任务："+new Date());
        //执行定时任务
        /**
         * 1.需要四个参数：
         * 线程执行任务Runnable  long类型的时间（设置了这行代码之后延迟多久去执行任务,单位是后面设置的）  定时任务执行的频率(下面的执行每多久执行)  第二、三个参数的时间的单位
         */
        scheduledExecutorService.scheduleAtFixedRate(new Runnable() {
            @Override
            public void run() {
                try {
                    //休眠1秒查看和3的区别
                    //即使休眠了1秒，执行的频率仍然是第三个参数的频率
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("执行任务："+new Date());
            }
        },1,3, TimeUnit.SECONDS);

        /**
         * 2.传递三个参数
         * schedule 只会执行一次
         * 延迟多久以后执行一次
         */
        /*scheduledExecutorService.schedule(new Runnable() {
            @Override
            public void run() {
                System.out.println("执行任务："+new Date());
            }
        },1,TimeUnit.SECONDS);*/

        /**
         * 3.传递和scheduleAtFixedRate一样的四个参数
         */
        scheduledExecutorService.scheduleWithFixedDelay(new Runnable() {
            @Override
            public void run() {
                try {
                    //休眠1秒查看和1的区别
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("执行任务："+new Date());
            }
        },1,3,TimeUnit.SECONDS);
    }
}


/**
 * scheduleAtFixedRate  以上次任务的开始时间作为下一次任务的开始时间的
 * scheduleWithFixedDelay   以上次任务的结束时间作为下一次任务的开始时间的
 *
 */
