public class Lan {
    /**
     * 饿汉代码
     */

    static class Sing{
        //私有的构造方法
        private Sing() {

        }

        //私有的变量
        private static Sing sing = new Sing();

        //获取私有变量的方法
        public static Sing getSing() {
            return sing;
        }
    }

    static Sing s1 = null;
    static Sing s2 = null;

    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                s1 = Sing.getSing();
            }
        });
        t1.start();

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                s2 = Sing.getSing();
            }
        });
        t2.start();

        t1.join();
        t2.join();

        System.out.println(s1 == s2);
    }

}
