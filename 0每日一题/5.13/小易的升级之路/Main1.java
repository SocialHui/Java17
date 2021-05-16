import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            int a = sc.nextInt();
            int[] nums = new int[n];
            for (int i = 0; i < n; i++) {
                nums[i] = sc.nextInt();
                if (nums[i] <= a) {
                    //此时打败怪兽
                    a += nums[i];
                } else {
                    //去计算最大公约数
                    int s = yue(a,nums[i]);
                    a += s;
                }
            }
            System.out.println(a);
        }
    }
    
    public static int yue(int a,int b) {
        int min = a>b?b:a;
        while (true) {
            if (a%min == 0 && b%min == 0) {
                return min;
            }
            min--;
        }
    }
}