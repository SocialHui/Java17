import java.util.Random;
import java.util.Scanner;

public class TestDemo {
    public static void main(String[] args) {
        //水仙花数
        for (int i = 1; i < 99999; i++) {
            //计算有一个数有几位
            int tmp = i;
            int count = 0;
            while (tmp != 0) {
                count++;
                tmp /= 10;
            }
            tmp = i;
            int sum = 0;
            while (tmp != 0) {
                sum += Math.pow(tmp%10,count);
                tmp/=10;
            }
            if (sum == i) {
                System.out.println(i+"是水仙花数");
            }
        }
    }
}
