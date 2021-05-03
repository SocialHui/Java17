package thread.thread0424;

/**
 * 判断优先级的执行顺序
 */
public class Test12 {

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            Thread t1 = new Thread(()->{
                System.out.println("t1");
            },"t1");
            t1.setPriority(1);
            t1.start();

            Thread t2 = new Thread(()->{
                System.out.println("t2");
            },"t2");
            t2.setPriority(5);
            t2.start();

            Thread t3 = new Thread(new Runnable() {
                @Override
                public void run() {
                    System.out.println("t3");
                }
            },"t3");
            t3.setPriority(10);
            t3.start();
        }
    }
}
