package thread.thread0426;

/**
 * 自定义线程终止
 */

public class Test15 {

    private static boolean flag = false;

    public static void main(String[] args) throws InterruptedException {

        Thread t1 = new Thread(()->{
            while (!flag) {
                try {
                    //线程休眠
                    Thread.sleep(100);

                    System.out.println("我正在转账");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            System.out.println("啊，差点误了大事");
        },"t1");

        //启动子线程
        t1.start();

        //主线程休眠一段时间
        //主线程休眠的时候子线程还在执行
        //主线程控制子线程是否继续执行
        Thread.sleep(320);

        //终止线程
        System.out.println("停止交易，有内鬼");
        flag = true;
    }
}
