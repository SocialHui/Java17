package thread.thread0518;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPollDemo53 {
    public static void main(String[] args) {
        /**
         * JDK8以后才有的创建方式
         * 创建方式6： 根据当前的硬件CPU生成对应个数的线程池，并且是异步执行的。
         */

        /**
         * 同步的方式：
         * 1.发请求
         * 2.等待执行完成
         * 3.有结果返回
         *
         * 异步的方式：
         * 1.发请求
         * 2.执行完成
         * 3.另一个程序异步处理，处理完成后进行回调返回结果
         */

        ExecutorService executorService = Executors.newWorkStealingPool();  //根据当前硬件配置创建线程池
        for (int i = 0; i < 10; i++) {
            executorService.execute(new Runnable() {
                @Override
                public void run() {
                    System.out.println("线程名："+Thread.currentThread().getName());
                }
            });
        }

        //等待线程池执行完成，就可以打印上面的内容了
        while (!executorService.isTerminated()){

        }
    }
}
