import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        //求斐波那契数列的第n项。(迭代实现)
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int sum1 = 1;
        int sum2 = 1;
        if (n>2) {
            for (int i = 3; i <= n; i++) {
                sum = sum1 + sum2;
                sum1 = sum2;
                sum2 = sum;
            }
            System.out.println(sum);
        } else {
            System.out.println(1);
        }
    }
}
