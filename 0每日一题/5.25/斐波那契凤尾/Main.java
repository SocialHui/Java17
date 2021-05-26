// write your code here
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] fib = new int[100001];
        fib[0] = 1;
        fib[1] = 1;
        for (int i = 2;i<fib.length;i++) {
            fib[i] = (fib[i-1] + fib[i-2])%1000000;
        }
        //注意如果求余的数据比6位少，还需要补0
        //从29位开始，斐波那契数的结果就开始比6位多了
        while (sc.hasNext()) {
            int num = sc.nextInt();
            if (num<29) {
                System.out.println(fib[num]);
            }else {
                System.out.printf("%06d\n",fib[num]);
            }
        }
    }
}