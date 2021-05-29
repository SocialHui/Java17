package thread.thread0526;

/**
 * 可重入锁演示
 */
public class ThreadDemo96 {
    //声明锁
    private static Object object = new Object();

    public static void main(String[] args) {
        /*while (true) {
            if (尝试获取锁) {
                break;
            }
        }
        for (;;) {
            if (尝试获取锁) {
                break;
            }
        }*/
        synchronized (object) {
            System.out.println("进入了主方法");
            synchronized (object) {
                System.out.println("重复进入了方法");
            }
        }
    }
}
