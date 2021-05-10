import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            int num = 0;
            while (n != 0) {
                if ((n & 1) == 1) {
                    num++;
                }
                n >>>= 1;
            }
            System.out.println(num);
        }
    }
}