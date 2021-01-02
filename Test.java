import java.util.Random;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        //编写程序数一下 1到 100 的所有整数中出现多少个数字9
        int num = 1;
        int sum = 0;
        while (num < 100) {
            if (num % 10 == 9) {
                sum++;
            }
            if (num / 10 == 9) {
                sum++;
            }
            num++;
        }
        System.out.println(sum);
    }


    public static void main1(String[] args) {
        //猜数字游戏
        Random num1 = new Random ();//默认随机数种子是系统时间
        Scanner sc = new Scanner(System.in);
        int toGuess = num1.nextInt(100);  //生成要猜的数字

        while (true){
            System.out.println("请输入你猜的数字：");
            int num = sc.nextInt();
            if (num > toGuess){
                System.out.println("猜大了");
            }else if (num < toGuess){
                System.out.println("猜小了");
            } else {
                System.out.println("猜对了");
                break;
            }
        }
    }
}
