// write your code here
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            if (n > 0) {
                long n1 = (long) Math.pow(5, n);
                long n2 = (long) Math.pow(4, n);
                System.out.println((n1 - 4) + " " + (n2 - 4 + n));
            }
        }
    }
}