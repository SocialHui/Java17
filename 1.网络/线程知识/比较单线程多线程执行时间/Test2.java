package thread.thread0424;


/**
 * 比较单线程和多线程的执行时间的差距
 */
public class Test2 {

    //定义执行的次数
    private static final int count = 1_0000_0000;

    public static void main(String[] args) throws InterruptedException {
        //多线程
        concurrency();

        //单线程
        serial();
    }

    //单线程方法
    private static void serial() {

        //记录开始的时间
        Long stime = System.currentTimeMillis();

        int a = 0;
        for (int i = 0; i < count; i++) {
            a++;
        }
        int b = 0;
        for (int i = 0; i < count; i++) {
            b++;
        }
        int c = 0;
        for (int i = 0; i < count; i++) {
            c++;
        }

        //记录结束的时间
        Long etime = System.currentTimeMillis();
        System.out.println("单线程执行的时间是:"+(etime-stime));
    }

    //多线程方法
    private static void concurrency() throws InterruptedException {
        Long stime = System.currentTimeMillis();
        int a = 0;
        //张三办理业务
        for (int i = 0; i < count; i++) {
            a++;
        }

        //李四同时执行业务
        //创建线程
        //方法一：
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                int b = 0;
                for (int i = 0; i < count; i++) {
                    b++;
                }
            }
        });

        //t1和主线程同时开始执行
        t1.start();

        //王玉同时执行业务
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                int c = 0;
                for (int i = 0; i < count; i++) {
                    c++;
                }
            }
        });

        //t2线程和主线程同时执行
        t2.start();

        /**
         * 等待子线程执行结束
         * 如果不等待，则主线程结束，不管子线程有没有结束，任务全部结束
         */

        t1.join();
        t2.join();

        Long etime = System.currentTimeMillis();
        System.out.println("多线程的执行时间是:"+(etime-stime));
    }
}
