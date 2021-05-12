import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            //去判断可以喝到几瓶
            if (n != 0) {
                int num = pin(n);
                System.out.println(num);
            }
        }
    }
    
    public static int pin(int n){
        if (n < 2) {
            return 0;
        } else if (n == 2) {
            return 1;
        } else {
            int num = n/3 + pin(n-(n/3)*3 + n/3);
            return num;
        }
    }
}