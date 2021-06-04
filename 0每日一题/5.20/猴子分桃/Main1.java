import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            int n = sc.nextInt();
            if (n > 0) {
                long x = (long) Math.pow(5, n);
                long y = (long) Math.pow(4, n);
                System.out.println((x - 4) + " " + (y - 4 + n));
            }
        }
    }
}