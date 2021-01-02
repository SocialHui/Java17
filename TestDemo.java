import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;

public class TestDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("请输入你的姓名：");
        String name = sc.nextLine();
        System.out.println("请输入你的年龄：");
        int age = sc.nextInt();
        System.out.println("请输入你的工资：");
        int money = sc.nextInt();
    }

    public static void main7(String[] args) {
        //计算1!+2!+3!+4!+5!
        int sum = 0;
        int n1 = 5;
        while (n1 > 0){
            int n = 1;
            int fact = 1;
            while (n <= n1){
                fact *= n;
                n++;
            }
            sum += fact;
            n1--;
        }
        System.out.println(sum);
    }

    public static void main6(String[] args) {
        //计算5的阶乘
        int n = 1;
        int fact = 1;
        while (n <= 5){
            fact =fact * n;
            n++;
        }
        System.out.println(fact);
    }

    public static void main5(String[] args) {
        //计算1~100的和
        int num = 1;
        int sum = 0;
        while (num < 100){
            sum += num;
            num++;
        }
        System.out.println(sum);
    }

    public static void main4(String[] args) {
        //打印1~10的数字
        int num =1;
        while (num <= 10){
            System.out.printf("%d ",num);
            num++;
        }
    }

    public static void main3 (String[] args) {
        //判定某一年份是否是闰年
        Scanner Year = new Scanner(System.in);
        int year =Year.nextInt();
        //int year = 2020;
        if (year % 100 == 0){
            if (year % 400 == 0){
                System.out.println(year + "是闰年");
            } else {
                System.out.println(year + "不是闰年");
            }
        } else {
            if (year % 4 == 0){
                System.out.println(year + "是闰年");
            } else {
                System.out.println(year + "不是闰年");
            }
        }
    }

    public static void main2 (String[] args) {
        //判定一个数字是正数还是负数
        int num =10;
        if (num > 0){
            System.out.println(num + "是正数");
        } else {
            System.out.println(num + "是负数");
        }
    }

    public static void main1 (String[] args) {
        //判定一个数字是奇数还是偶数
        int num =15;
        if (num % 2 == 0){
            System.out.println(num + "是偶数");
        }else{
            System.out.println(num + "是奇数");
        }
        System.out.println();
    }
}
