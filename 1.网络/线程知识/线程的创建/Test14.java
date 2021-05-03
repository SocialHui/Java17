package thread0426;

public class Test14 {
    public static void main(String[] args) {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("线程名："+Thread.currentThread().getName());
            }
        };

        Thread thread = new Thread(runnable);
        thread.start();
    }
}
