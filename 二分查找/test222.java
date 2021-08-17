import java.util.Arrays;

public class test222 {
    public static void main(String[] args) {
        int[] nums = {1,4,2,5,6,3,8,6,3,9};
        merge1(nums,100);
    }

    //完全错误的解法
    /*public static void merge(int n, int[] nums, int left, int right) {
        Arrays.sort(nums);
        int mid = (left+right)/2;
        if (nums[mid] < n) {
            left = mid;
            merge(n,nums,left,right);
        } else if (nums[mid] > n) {
            right = mid;
            merge(n,nums,left,right);
        } else {
            //找到了，跳出
            System.out.println(mid);
            return;
        }
    }*/

    public static void merge1(int[] nums, int num) {
        Arrays.sort(nums);
        int left = 0;
        int right = nums.length-1;
        int mid = (left+right)/2;
        while (left < right) {
            mid = (left+right)/2;
            if (num > nums[mid]) {
                left = mid+1;
            } else if (num < nums[mid]) {
                right = mid-1;
            } else {
                System.out.println(mid);
                return;
            }
        }
        System.out.println("没有这个数字，查找失败");
        return;
    }
}
