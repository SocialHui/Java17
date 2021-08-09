package thread.thread0809;

/**
 * 线程中断的代码
 */
public class Test3 {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                //while (!Thread.interrupted()) {
                while (!Thread.currentThread().isInterrupted()) {
                    System.out.println("正在转账");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                        System.out.println("有内鬼，停止交易");
                        break;
                    }
                }
                System.out.println("啊，它是骗子，差点误了大事");
            }
        },"里斯");

        System.out.println("让里斯开始转账");
        thread.start();
        Thread.sleep(10000);
        System.out.println("他是个骗子，快让里斯停止转账");
        thread.interrupt();
    }
}
