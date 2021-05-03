package thread.thread0426;

public class Test17 {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(()->{
            //两种用来判断线程终止的方式
            //两种方法截然不同
            //虽然显示的结果完全相同
            //while (!Thread.interrupted()) {
            while (!Thread.currentThread().isInterrupted()) {
                System.out.println("我正在转账");
            }
            System.out.println("啊，差点误了大事");
        });

        t1.start();

        Thread.sleep(10);
        System.out.println("有内鬼，终止交易");
        t1.interrupt();
    }
}
