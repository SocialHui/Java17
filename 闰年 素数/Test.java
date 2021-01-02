import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        //给定一个数字，判定一个数字是否是素数
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int n = 0;
        int n1 = 2;
        for (; n1 < num; n1++){
            if (num % n1 == 0){
                n++;
                break;
            }
        }
        if (n == 0){
            System.out.println(num + "是素数");
        } else {
            System.out.println(num + "不是素数");
        }
    }

    public static void main2(String[] args) {
        //打印 1 - 100 之间所有的素数
        int i;
        int n;
        for (i = 1; i <= 100; i++){
            int num = 0;
            for (n = 2; n < i; n++){
                if (i%n == 0){
                    num++;
                    break;
                }
            }
            if (num == 0){
                System.out.println(i+"是素数");
            }
        }
    }

    public static void main1(String[] args) {
        //输出 1000 - 2000 之间所有的闰年
        int year = 1000;
        while (year <= 2000){
            if (year%400 == 0){
                System.out.println(year + "是闰年");
            } else if (year%4 == 0 && year % 100 != 0){
                System.out.println(year + "是闰年");
            }
            year++;
        }
    }
}
