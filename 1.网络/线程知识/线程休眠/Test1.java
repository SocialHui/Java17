package thread.thread0424;

import java.util.concurrent.TimeUnit;

/**
 * 线程休眠的演示
 */
public class Test1 {
    public static void main(String[] args) throws InterruptedException {
        String str  = "你好java，我希望我们可以有一个好的相处，不论遇到什么困难，我都不会放弃我的未来的";

        for (char ch : str.toCharArray()) {
            //直接全部打印的方法
            System.out.print(ch);

            //休眠方式一
            //Thread.sleep(300);   //休眠0.3秒打印

            //休眠方式二
            //TimeUnit.SECONDS.sleep(1);   //休眠一秒钟打印

            //休眠方式三
            //将秒转换成毫秒
            Thread.sleep(TimeUnit.SECONDS.toMillis(1));  //休眠一秒钟打印
        }
    }
}
