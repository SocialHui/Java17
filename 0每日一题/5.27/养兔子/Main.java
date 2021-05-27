// write your code here
import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            if (n <= 2) {
            if (n == 1) {
                System.out.println(1);
            }
            if (n == 2) {
                System.out.println(2);
            }
            } else {
                long n1 = 1;
                long n2 = 2;
                int count = 2;
                while (n != count) {
                    long tmp = n1+n2;
                    n1 = n2;
                    n2 = tmp;
                    count++;
                }
                System.out.println(n2);
            }
        }
    }
}