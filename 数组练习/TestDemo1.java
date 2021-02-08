import java.util.Arrays;

public class TestDemo {
    public static void main(String[] args) {
        int[] nums = {1,3,5,8,6,4,9};
        int target = 13;
        System.out.println(Arrays.toString(twoSum(nums, target)));
    }

    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i,j};
                }
            }
        }
        return null;
    }

}
