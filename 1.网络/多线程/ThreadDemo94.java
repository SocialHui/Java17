package thread.thread0526;

import java.util.concurrent.atomic.AtomicStampedReference;

/**
 * 使用代码的方式演示ABA
 */
public class ThreadDemo94 {

    private static AtomicStampedReference money = new AtomicStampedReference(1000,1);  //初始化值V    版本号

    public static void main(String[] args) throws InterruptedException {

        //转账 -100
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                /**
                 * 需要传递四个值：
                 * expectedReference   旧值
                 * newReference    新值
                 * expectedStamp   旧版本号
                 * newStamp        新版本号
                 */
                boolean result = money.compareAndSet(1000,0,1,2);
                System.out.println("线程1执行转账  "+result);
            }
        });
        t1.start();
        t1.join();


        //中途账户多了一笔钱
        Thread t3 = new Thread(new Runnable() {
            @Override
            public void run() {
                boolean result = money.compareAndSet(0,1000,2,3);
                System.out.println("线程3转入了100元  "+result);
            }
        });
        t3.start();

        t1.join();
        t3.join();


        //不小心点错了
        //转账 -100
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                boolean result = money.compareAndSet(1000,0,1,2);   //预期值     修改值
                System.out.println("线程1执行转账  "+result);
            }
        });
        t2.start();
    }
}
