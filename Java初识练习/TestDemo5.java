import java.util.Random;
import java.util.Scanner;

public class TestDemo {
    public static void main(String[] args) {
        //判断一个数是不是素数
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int tmp = 0;
        for (int i = 2; i < Math.sqrt(num); i++) {
            if (num%i == 0){
                tmp = 1;
                break;
            }
        }
        if (tmp == 0) {
            System.out.println(num + "是素数");
        } else {
            System.out.println(num + "不是素数");
        }
    }
}
