package thread.thread0424;

public class Test11 {
    public static void main(String[] args) {
        ThreadGroup threadGroup = new ThreadGroup("赛跑");
        Thread t1 = new Thread(threadGroup, new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("选手1到达终点");
            }
        });
        t1.start();

        Thread t2 = new Thread(threadGroup, new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(20);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("选手2到达终点");
            }
        });
        t2.start();

        //等待分组中所有的线程执行结束
        while (threadGroup.activeCount() != 0) {
        }

        System.out.println("宣布比赛结果");
    }
}
