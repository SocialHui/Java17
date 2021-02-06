import java.util.Random;
import java.util.Scanner;

public class TestDemo {
    public static void main(String[] args) {
        //计算1/1-1/2+1/3-1/4+1/5 …… + 1/99 - 1/100 的值
        double sum = 0.0;
        int tmp = 1;
        for (int i = 1; i <= 100; i++) {
            sum += 1.0/(i*tmp);
            tmp = -tmp;
        }
        System.out.println(sum);
    }
}
