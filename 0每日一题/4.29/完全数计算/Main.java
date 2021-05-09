import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int num = sc.nextInt();
            int n = 0;//用来统计完全数的个数
            //首先明确一点，负数和0没有约数
            for (int i = 1; i < num; i++) {
                //去判断i是不是完全数
                boolean flag = wan(i);
                //如果是
                if(flag) {
                    n++;
                }
            }
            System.out.println(n);
        }
    }

    public static boolean wan(int n) {
        HashSet<Integer> set = new HashSet<>();  //用来存放约数
        for (int i = 1; i < n; i++) {
            if (n%i == 0) {
                set.add(i);
            }
        }
        int sum = 0;
        Object[] nums = set.toArray();
        for (int i = 0; i < nums.length; i++) {
            int s = (int) nums[i];
            sum += s;
        }
        if (sum == n) {
            return true;
        } else {
            return false;
        }
    }
}