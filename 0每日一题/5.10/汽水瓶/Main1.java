import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            if (n>0) {
            int num = pin(n);
            System.out.println(num);
            }
        }
    }
    
    public static int pin(int a) {
        if (a < 2) {
            return 0;
        } else if (a == 2) {
            return 1;
        } else {
            return a/3 + pin(a - 3*(a/3) + a/3);
        }
    }
}