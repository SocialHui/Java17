import java.util.Scanner;

public class TestDemo {
    public static void main(String[] args) {
        //创建方法求两个数的最大值max2，随后再写一个求3个数的最大值的函数max3。
        Scanner scanner = new Scanner(System.in);
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        int n3 = scanner.nextInt();
        int max = max2(n1, n2);
        int max1 = max2(max,n3);
        System.out.println(max);
        System.out.println(max1);
    }

    public static int max2 (int n1,int n2) {
        return Math.max(n1, n2);
    }
}
