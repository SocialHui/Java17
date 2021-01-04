import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        //递归打印
        //按顺序打印一个数字的每一位(例如 1234 打印出 1 2 3 4)
        System.out.print("请输入一个整数： ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        print(n);
    }

    public static void print (int n) {
        if (n < 10) {
            System.out.print(n + " ");
        } else {
            print(n/10);
            System.out.print(n%10 + " ");
        }
    }

}
