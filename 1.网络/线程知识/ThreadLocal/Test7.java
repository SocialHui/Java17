package thread.thread0809;

public class Test7 {

    //创建并初始化ThreadLocal
    private static ThreadLocal<String> threadLocal =
            new ThreadLocal() {
                @Override
                protected String initialValue() {
                    System.out.println("执行了 initialValue 方法");
                    return Thread.currentThread().getName()+" Java";
                }
            };
    /*ThreadLocal.withInitial(new Supplier<String>() {
        @Override
        public String get() {
            System.out.println("执行了 withInitial 方法");
            return Thread.currentThread().getName()+" Java";
        }
    });*/
    public static void main(String[] args) {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                /**
                 * 当ThreadLocal中既有set方法，又有初始化方法的时候，所有的初始化方法都不会执行！！！！
                 */
                threadLocal.set(Thread.currentThread().getName()+" 你好");
                String result = threadLocal.get();
                System.out.println(Thread.currentThread().getName()+"获取到的内容："+result);
            }
        };
        Thread t1 = new Thread(runnable,"线程1");
        t1.start();

        Thread t2 = new Thread(runnable,"线程2");
        t2.start();
    }
}