public class En {
    //懒汉方式的代码

    static class Sing{
        //私有的构造方法
        private Sing() {

        }

        //私有的变量
        //volatile保证线程安全，防止指令重排序
        private volatile static Sing sing = null;

        //获取变量的公开方式
        public static Sing getSing() {
            //双重检验锁
            if (sing == null) {
                //代表是第一次访问
                synchronized (Sing.class) {
                    if (sing == null) {
                        sing = new Sing();
                    }
                }
            }
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
