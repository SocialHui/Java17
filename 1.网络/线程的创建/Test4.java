package thread.thread0424;

/**
 * 继承Thread类
 */
public class Test4 {
    public static void main(String[] args) {
        //写法二：
        Thread thread = new Thread(){
            @Override
            public void run() {
                System.out.println("子线程名称："+Thread.currentThread().getName());
            }
        };
        thread.start();
    }

}
