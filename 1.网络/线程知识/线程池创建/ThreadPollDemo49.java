package thread.thread0518;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/**
 * 自定义线程池规则（线程池的名称，优先级。。。。。。）
 */

public class ThreadPollDemo49 {
    public static void main(String[] args) {
        //设置线程优先级
        MyThreadFactor myThreadFactor = new MyThreadFactor();   //线程工厂
        ExecutorService executorService = Executors.newFixedThreadPool(10,myThreadFactor);
        for (int i = 0; i < 10; i++) {
            executorService.execute(new Runnable() {
                @Override
                public void run() {
                    Thread thread = Thread.currentThread();  //获取当前线程
                    System.out.println("线程名："+thread.getName() + "优先级："+thread.getPriority());
                }
            });
        }
    }

    private static int count = 1;

    static class MyThreadFactor implements ThreadFactory {

        @Override
        public Thread newThread(Runnable r) {
            Thread thread = new Thread(r);  //注意要将任务传递给线程
            //自定义线程池的名称规则
            thread.setName("mypoll-"+ count++);
            thread.setPriority(10);  //设置线程的优先级
            return thread;
        }
    }
}
