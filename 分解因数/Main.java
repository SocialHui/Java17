// write your code here
import java.util.*;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int num = sc.nextInt();
            StringBuilder builder = new StringBuilder();
            builder.append(num+" = ");
            int i = 2;
            while (i <= num) {
                if (num % i == 0) {
                    builder.append(i+" * ");
                    num = num/i;
                } else {
                    i++;
                }
            }
            System.out.println(builder.substring(0,builder.length()-3));
        }
    }
}