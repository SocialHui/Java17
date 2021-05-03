package thread.thread0424;

/**
 * 线程创建方法一
 *
 * 继承Thread类
 *
 * 因为java是单继承的，当继承了Thread类之后，就不能继承其他类了
 */
public class Test3 {

    //写法一：
    static class MyThread extends Thread{
        @Override
        public void run() {
            System.out.println("子线程的名称："+Thread.currentThread().getName());
        }
    }

    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        //启动线程
        myThread.start();
        System.out.println("主线程名称："+Thread.currentThread().getName());

        //主线程和子线程的名称不相同，说明创建线程成功
    }
}
