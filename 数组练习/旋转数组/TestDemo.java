
public class TestDemo {

    public static void main(String[] args) {
        int[] nums = {21,45,96,88};
        rotate(nums,2);
    }

    public static void rotate(int[] nums, int k) {
        if (nums.length == 0 || k == 0) {
            return;
        }
        k = k%nums.length;
        nums = reserve(nums,0,nums.length-k-1);
        nums = reserve(nums,nums.length-k,nums.length-1);
        nums = reserve(nums,0,nums.length-1);
    }

    public static int[] reserve(int[] nums, int left, int right) {
        while (left < right) {
            int tmp = nums[left];
            nums[left] = nums[right];
            nums[right] = tmp;
            left++;
            right--;
        }
        return nums;
    }
}

//https://leetcode-cn.com/problems/rotate-array/submissions/



