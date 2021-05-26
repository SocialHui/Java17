// write your code here
import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            if (n > 0) {
            int count = 0;
            while (n > 1) {
                if (n%3 == 0) {
                    n /= 3;
                } else {
                    n = n/3+1;
                }
                count++;
            }
            System.out.println(count);
            }
        }
    }
}