//只要和不是小于0的数字，对后面的和来说都是会做出贡献的数值、

import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            int[] nums = new int[n];
            for (int i = 0; i < n; i++) {
                nums[i] = sc.nextInt();
            }
            
            int sum = nums[0];
            int max = nums[0];
            
            for (int i = 1; i < n; i++) {
                if (sum >= 0) {
                    sum += nums[i];
                } else {
                    sum = nums[i];
                }
                
                if (sum > max) {
                    max = sum;
                }
            }
            System.out.println(max);
        }
    }
}
