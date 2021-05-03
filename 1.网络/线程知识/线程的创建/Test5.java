package thread.thread0424;

/**
 *
 * 创建线程方法二
 *
 * 实现Runnable接口
 */
public class Test5 {

    //写法三：
    static class MyRunnable implements Runnable{

        @Override
        public void run() {
            System.out.println("线程名称："+Thread.currentThread().getName());
        }
    }
    public static void main(String[] args) {
        MyRunnable myRunnable = new MyRunnable();
        //创建线程
        Thread thread = new Thread(myRunnable);
        thread.start();
    }
}
