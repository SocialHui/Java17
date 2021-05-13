import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int group = sc.nextInt();
        while (group-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] nums = new int[2*n];
            int[] nums2 = new int[2*n];
            for (int i = 0; i < 2*n; i++) {
                nums[i] = sc.nextInt();
            }
            
            while (k-- > 0) {
                int d = n;
                int i = 0;
                while (d < 2*n) {
                    nums2[i++] = nums[d-n];
                    nums2[i++] = nums[d];
                    d++;
                }
                nums = nums2;
                nums2 = new int[2*n];
            }
            
            //输出操作
            for (int i = 0; i < nums.length; i++) {
                if (i != nums.length-1) {
                    System.out.print(nums[i]+" ");
                } else {
                    System.out.println(nums[i]);
                }
            }
        }
    }
}