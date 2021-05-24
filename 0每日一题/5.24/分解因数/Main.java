// write your code here
import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int num = sc.nextInt();
            if (num >1) {
            StringBuilder builder = new StringBuilder(num+" "+"="+" ");
            int i = 2;
            while (num >= i){
                if (num%i == 0) {
                    builder.append(i+" "+"*"+" ");
                    num /= i;
                } else {
                    i++;
                }
            }
                System.out.println(builder.toString().substring(0,builder.length()-3));
            }
            
        }
    }
}