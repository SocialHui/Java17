import java.util.Arrays;
import java.util.Scanner;

public class TestDemo {
    public static void main(String[] args) {
        //求1！+2！+3！+4！+........+n!的和
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += fac(i);
        }
        System.out.println(sum);
    }

    public static int fac(int i) {
        if (i == 1) {
            return 1;
        }
        return i*fac(i-1);
    }
}
