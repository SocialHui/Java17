package thread.thread0529;


import java.util.Random;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * 计数器示例
 */
public class ThreadDemo98 {
    public static void main(String[] args) throws InterruptedException {
        //创建计数器为3
        CountDownLatch countDownLatch = new CountDownLatch(3);  //当线程数到达3个之后再去执行其他的任务

        ThreadPoolExecutor executor = new ThreadPoolExecutor(10,10,
                0, TimeUnit.SECONDS,new LinkedBlockingDeque<>(100));


        //执行任务
        executor.execute(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName()+" 开跑");
                int num = new Random().nextInt(5);
                num+=1;
                try {
                    Thread.sleep(num*1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName()+" 也到达了终点");

                //计数器-1
                countDownLatch.countDown();

            }
        });

        //执行任务
        executor.execute(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName()+" 开跑");
                int num = new Random().nextInt(5);
                num+=1;
                try {
                    Thread.sleep(num*1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName()+" 也到达了终点");

                //计数器-1
                countDownLatch.countDown();

            }
        });

        //执行任务
        executor.execute(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName()+" 开跑");
                int num = new Random().nextInt(5);
                num+=1;
                try {
                    Thread.sleep(num*1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName()+" 也到达了终点");

                //计数器-1
                countDownLatch.countDown();

            }
        });


        //执行任务
/*
        executor.execute(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName()+" 开跑");
                int num = new Random().nextInt(5);
                num+=1;
                try {
                    Thread.sleep(num*1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName()+" 也到达了终点");

                //计数器-1
                countDownLatch.countDown();
            }
        });
*/

        //等待所有的选手都到达终点，等待计数器为0
        countDownLatch.await();

        System.out.println("比赛结束，宣布成绩");
    }
}
