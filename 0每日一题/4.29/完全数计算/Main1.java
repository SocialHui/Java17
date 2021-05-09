import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int num = sc.nextInt();
            int n = 0;//用来统计完全数的个数
            //首先明确一点，负数和0没有约数
            for (int i = 1; i <= num; i++) {
                int sum = 0;
                for (int j = 1; j < i; j++) {
                    if (i%j == 0) {
                        sum += j;
                    }
                }
                if (sum == i) {
                    n++;
                }
            }
            System.out.println(n);
        }
    }
}