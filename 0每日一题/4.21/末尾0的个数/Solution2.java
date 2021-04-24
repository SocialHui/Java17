import java.util.*;

public class Solution{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            int num = 0;  //用来对末尾0的个数进行计数
            for (int i = n; i >= 5; i--) {
                int n1 = i;
                while (n1%5 == 0) {
                    num++;
                    n1 /= 5;
                }
            }
            System.out.println(num);
        }
    }
}

