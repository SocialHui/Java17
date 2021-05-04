package thread.thread0504;

/*有三个线程，分别只能打印A，B和C
        要求按顺序打印ABC，打印10次
        输出示例：
        ABC
        ABC
        ABC
        ABC
        ABC
        ABC
        ABC
        ABC
        ABC
        ABC*/
public class Test18 {
    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 10; i++) {
            Thread thread = new Thread(() -> {
                System.out.print("A");
            });
            Thread thread2 = new Thread(() -> {
                System.out.print("B");
            });
            Thread thread3 = new Thread(() -> {
                System.out.print("C");
            });
            
            //打印10次
            //启动打印A线程并且等待A线程执行结束
            thread.start();
            thread.join();

            //启动打印B线程并且等待B线程执行结束
            thread2.start();
            thread2.join();

            //启动打印C线程并且等待C线程执行结束
            thread3.start();
            thread3.join();
            System.out.println();
        }
    }

    /**
     * 注意下面这种写法是错误的
     * 因为一个线程不能启动多次，运行的时候会发生错误
     */
   /* public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(()->{
            System.out.print("A");
        });
        Thread thread2 = new Thread(()->{
            System.out.print("B");
        });
        Thread thread3 = new Thread(()->{
            System.out.print("C");
        });

        for (int i = 0; i < 10; i++) {
            //打印10次
            //启动打印A线程并且等待A线程执行结束
            thread.start();
            thread.join();

            //启动打印B线程并且等待B线程执行结束
            thread2.start();
            thread2.join();

            //启动打印C线程并且等待C线程执行结束
            thread3.start();
            thread3.join();
            System.out.println();
        }
    }*/
}



