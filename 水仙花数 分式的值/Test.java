import java.util.Random;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        //求两个正整数的最大公约数
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int i;
        if (num1 > num2){
            i = num2;
        }else {
            i=num1;
        }
        for (int n = i; n >= 2; n--){
            if (num1 % n ==0 && num2 % n ==0){
                System.out.println(n + "是两个数的最大公约数");
                break;
            }
        }
    }

    public static void main3(String[] args) {
        //计算1/1-1/2+1/3-1/4+1/5 …… + 1/99 - 1/100 的值
        int i = 1;
        double n = 1.0;
        double sum = 0;
        while (i <= 100){
            sum += n/i;
            i++;
            n = -n;
        }
        System.out.println(sum);
    }

    public static void main2(String[] args) {
        //水仙花数
        int num = 1;
        for (num = 1; num < 1000; num++) {
            int n = num;
            int count = 0;//判断这个数字有几位
            while (n != 0) {
                n /= 10;
                count++;
            }
            n = num;
            int sum = 0;
            while (n != 0) {
                sum += Math.pow(n % 10, count);
                n /= 10;
            }
            if (sum == num){
                System.out.println(num+ "是水仙花数");
            }
        }
    }

    public static void main1(String[] args) {
        //猜数字游戏
        Random random = new Random();  // 随机数种子
        int toGuess = random.nextInt(100);//生成随机数
        Scanner sc = new Scanner(System.in);

        while (true){
            System.out.println("输入你猜的数字");
            int num = sc.nextInt();
            if (num < toGuess){
                System.out.println("猜小了");
            }else if (num > toGuess){
                System.out.println("猜大了");
            }else{
                System.out.println("猜对了");
                break;
            }
        }
    }
}
