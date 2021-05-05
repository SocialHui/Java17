import java.util.*;

public class Solution{
    public static void main(String[] args) {
import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int num = sc.nextInt();
            int left = num/2;
            int right = num-left;
            //接下来去判断这两个数是不是素数，如果都是素数，则直接输出这两个数字
            while (true) {
                if (isSu(left) && isSu(right)) {
                    //代表两个数都是素数
                    System.out.println(left);
                    System.out.println(right);
                    break;
                } else {
                    //代表有一个不是素数或者两个都不是素数
                    //则继续判断
                    left--;
                    right++;
                }
            }
        }
    }
    //判断一个数字是不是素数
    public static boolean isSu(int number) {
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                //代表不是素数
                return false;
            }
        }
        return true;
    }
}