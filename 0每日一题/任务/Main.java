import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            //去判断可以喝到几瓶
            if (n != 0) {
                System.out.println(n/2);
            }
        }
    }
}