package thread.thread0424;

import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * 创建线程方法三
 *
 * Callable + Future  接收线程执行之后的返回值
 */
public class Test8 {
    //写法6
    static class MyCallable implements Callable<Integer>{  //返回结果的类型

        @Override
        public Integer call() throws Exception {
            int num = new Random().nextInt(10); //产生一个随机数
            System.out.println(String.format("线程名：%s,产生的随机数：%d",
                    Thread.currentThread().getName(),num));
            return num;
        }
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        //创建Callable子对象
        MyCallable callable = new MyCallable();

        //是同一个FutureTask的容器接收返回值
        FutureTask futureTask = new FutureTask(callable);

        //创建线程
        Thread thread = new Thread(futureTask);

        thread.start();
        //接收返回的值
        int num = (int) futureTask.get();
        System.out.println("返回的值："+num);
    }
}
