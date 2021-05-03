package thread.thread0426;

/**
 * 使用interrupt()方法实现终止
 */
public class Test16 {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(()->{
            while (!Thread.interrupted()) {
                try {
                    //子线程休眠
                    Thread.sleep(100);

                    System.out.println("我正在转账");
                } catch (InterruptedException e) {
                    //e.printStackTrace();

                    //必须要加上break，否则代码不会终止
                    //必须自己处理来实现终止
                    //休眠的时候需要break；
                    break;
                }
            }
            System.out.println("啊，差点误了大事");
        },"t1");

        t1.start();

        Thread.sleep(320);
        System.out.println("停止交易，有内鬼");
        //子线程终止的口令
        t1.interrupt();
    }
}
