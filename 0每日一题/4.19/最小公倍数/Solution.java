import java.util.*;

public class Solution{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n1 = sc.nextInt();
            int n2 = sc.nextInt();
            //先求两个数的最大公约数
            int n = da(n1,n2);
            System.out.println(n1/n*n2);
        }
    }

    public static int da(int n1,int n2) {
        int n = 1;
        if (n1 > n2) {
            n = n2;  //找到较小的数字
        } else {
            n = n1;
        }
        while (n > 0) {
            if (n1%n == 0 && n2%n == 0) {
                return n;
            } else {
                n--;
            }
        }
        return n;
    }
}