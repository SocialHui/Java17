import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        //递归求 N 的阶乘
        System.out.println("请输入一个数字");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int fact = Fact(n);
        System.out.println(fact);
    }

    public static int Fact (int n) {
        if (n <= 1) {
            return 1;
        }
        int fact = n * Fact(n-1);
        return fact;
    }

}
