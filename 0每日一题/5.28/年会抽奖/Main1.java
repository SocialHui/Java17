// write your code here
import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long[] zong = new long[21];   //注意一定要是long类型的！！！
        long[] ke = new long[21];

        zong[0] = 0;
        zong[1] = 1;
        zong[2] = 2;

        ke[0] = 0;
        ke[1] = 0;
        ke[2] = 1;

        for (int i = 3; i < zong.length; i++) {
            zong[i] = zong[i - 1] * i;
            ke[i] = (i - 1) * (ke[i - 1] + ke[i - 2]);
        }

        while (sc.hasNext()) {
            //用总共的可能的抽奖结果/所有人都没有获奖的结果 = 最终要求的概率
            int n = sc.nextInt();
            System.out.printf("%.2f%%\n", 100.0 * ke[n] / zong[n]);
        }
    }
}