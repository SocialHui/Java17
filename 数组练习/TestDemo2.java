import java.util.Arrays;

public class TestDemo {
    public static void main(String[] args) {
        int[] nums = {1,2,1,2,2};
        Arrays.sort(nums);
        System.out.println(target(nums));
    }

    public static int target(int[] nums) {
        for (int i = 0; i <= nums.length/2; i++) {
            if (nums[i] == nums[i+nums.length/2]) {
                return nums[i];
            }
        }
        return -1;
    }

}
