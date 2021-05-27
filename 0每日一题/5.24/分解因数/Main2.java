// write your code here
import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            StringBuilder builder = new StringBuilder();
            builder.append(n);
            builder.append(" = ");
            int i = 2;
            while (n >= i) {
                if (n%i == 0) {
                    builder.append(i);
                    builder.append(" * ");
                    n /= i;
                } else {
                    i++;
                }
            }
            System.out.println(builder.toString().substring(0,builder.length()-3));
        }
    }
}