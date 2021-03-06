package thread.thread0529;

import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.Semaphore;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ThreadDemo97 {
    public static void main(String[] args) {
        //创建信号量
        Semaphore semaphore = new Semaphore(2);   //2 代表停车场里面有两个位置

        //创建线程池
        //每一个任务就是一辆车
        ThreadPoolExecutor executor = new ThreadPoolExecutor(10,10,
                0, TimeUnit.SECONDS,new LinkedBlockingDeque<>(1000));

        executor.execute(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName()+" 到达停车场门口");
                try {
                    Thread.sleep(1000);

                    //尝试获取锁
                    semaphore.acquire();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                //执行到这行代码代表已经获取到了停车位
                System.out.println(Thread.currentThread().getName()+" 进入停车场");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                System.out.println(Thread.currentThread().getName()+" 离开停车场");

                //释放锁
                semaphore.release();
            }
        });

        //执行任务2
        executor.execute(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName()+" 到达停车场门口");
                try {
                    Thread.sleep(1000);
                    //尝试获取锁
                    semaphore.acquire();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                //执行到这行代码代表已经获取到了停车位
                System.out.println(Thread.currentThread().getName()+" 进入停车场");
                try {
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                System.out.println(Thread.currentThread().getName()+" 离开停车场");

                //释放锁
                semaphore.release();
            }
        });

        //执行任务3
        executor.execute(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName()+" 到达停车场门口");
                try {
                    Thread.sleep(1000);
                    //尝试获取锁
                    semaphore.acquire();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                //执行到这行代码代表已经获取到了停车位
                System.out.println(Thread.currentThread().getName()+" 进入停车场");
                try {
                    Thread.sleep(1500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                System.out.println(Thread.currentThread().getName()+" 离开停车场");

                //释放锁
                semaphore.release();
            }
        });


        //执行任务4
        executor.execute(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName()+" 到达停车场门口");
                try {
                    Thread.sleep(1000);
                    //尝试获取锁
                    semaphore.acquire();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                //执行到这行代码代表已经获取到了停车位
                System.out.println(Thread.currentThread().getName()+" 进入停车场");
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                System.out.println(Thread.currentThread().getName()+" 离开停车场");

                //释放锁
                semaphore.release();
            }
        });
    }
}
