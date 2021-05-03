package thread.thread0424;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * 线程分组
 */
public class Test10 {

    //线程公共的方法
    static class MyCallable implements Callable<Integer> {

        @Override
        public Integer call() throws Exception {
            int a = 0;
            for (int i = 0; i < 1000; i++) {
                a++;
            }
            return a;
        }
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        //创建一个分组
        ThreadGroup threadGroup = new ThreadGroup("calc");  //记得设置线程分组名

        MyCallable callable = new MyCallable();
        FutureTask<Integer> futureTask = new FutureTask<>(callable);
        //创建一个线程并把线程放进threadGroup分组中
        Thread thread = new Thread(threadGroup,futureTask);
        thread.start();

        FutureTask<Integer> futureTask1 = new FutureTask<>(callable);
        Thread thread1 = new Thread(threadGroup,futureTask1);
        thread1.start();

        while (threadGroup.activeCount()!= 0) {
            //代表线程分组里面的任务没有执行结束
        }

        int num = futureTask.get()+futureTask1.get();
        System.out.println("计算结果为："+num);
    }
}
