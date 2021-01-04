import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        //求 N 的阶乘 。
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int fac = fact(n);
        System.out.println(fac);
    }

    public static int fact (int n) {
        int fac = 1;
        for (int i = 1; i <= n; i++) {
            fac *= i;
        }
        return fac;
    }

    public static void main1(String[] args) {
        //求1！+2！+3！+4！+........+n!的和
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ret = Fact(n);
        System.out.println(ret);
    }

    public static int Fact (int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            int ret = 1;
            for (int j=1; j<=i; j++) {
                ret *= j;
            }
            sum += ret;
        }
        return sum;
    }
}
