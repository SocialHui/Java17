import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            int num = 0;   //n比1大
            for (int i = 2; i <= n; i++) {
                int j = i;
                while (j != 0) {
                    if (j%10 == 1) {
                        num++;
                    }
                    j /= 10;
                }
            }
            System.out.println(num);
        }
    }
}
