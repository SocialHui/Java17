package thread.thread0424;

/**
 * 使用两个线程打印出来AABBCCDD这样一组数据
 *    前提：每个线程只能打印ABCD
 */
public class Test13 {
    public static void main(String[] args) throws InterruptedException {
        String str = "ABCD";
/*        for (char ch : str.toCharArray()) {
            Thread t1 = new Thread(new Runnable() {
                @Override
                public void run() {
                    System.out.print(ch);
                }
            });
            t1.start();

            Thread t2 = new Thread(new Runnable() {
                @Override
                public void run() {
                    System.out.print(ch);
                }
            });
            t2.start();
        }*/
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (char ch: str.toCharArray()) {
                    try {
                        System.out.print(ch);
                        Thread.sleep(200);   //设置的休眠时间不能太短，否则不能按照题目要求输出。因为设置的时间太短，可能没有留够足够的时间去打印内容

                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });
        t1.start();

        Thread t2 = new Thread(()->{
            for (char ch :str.toCharArray()) {
                try {
                    System.out.print(ch);
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        t2.start();

        t1.join();
        t2.join();
    }
}
