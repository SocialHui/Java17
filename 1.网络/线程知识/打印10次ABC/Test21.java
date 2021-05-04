package thread.thread0504;

public class Test21 {
    public static void main(String[] args) throws InterruptedException {

        for (int i = 0; i < 10; i++) {
            Thread t1 = new Thread(new Runnable() {
                @Override
                public void run() {
                    System.out.print("A");
                }
            });

            Thread t2 = new Thread(new Runnable() {
                @Override
                public void run() {
                    System.out.print("B");
                }
            });

            Thread t3 = new Thread(new Runnable() {
                @Override
                public void run() {
                    System.out.println("C");
                }
            });

            t1.start();
            t1.join();
            t2.start();
            t2.join();
            t3.start();
            t3.join();
        }
    }
}
