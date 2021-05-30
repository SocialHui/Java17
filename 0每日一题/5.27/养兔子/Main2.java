import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();   //代表第n天
            long n1 = 1;
            long n2 = 1;
            while (n != 0) {
                long tmp = n1+n2;
                n1 = n2;
                n2 = tmp;
                n--;
            }
            System.out.println(n1);
        }
    }
}