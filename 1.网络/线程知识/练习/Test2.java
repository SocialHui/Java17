package thread.thread0809;

/**
 * 线程中断的代码演示
 */
public class Test2 {
    static boolean flag = false;  //用来标识线程是否中断

    public static void main(String[] args) throws InterruptedException {

        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                while (!flag) {
                    System.out.println("正在转账");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                        System.out.println("有内鬼，终止交易");
                    }
                }
                System.out.println("啊，它是骗子啊，差点误了大事");
            }
        },"张三");


        System.out.println(thread.getName()+"开始转帐了");
        thread.start();
        Thread.sleep(10000);
        System.out.println("那人是骗子，快停止转账");
        flag = true;
    }
}
