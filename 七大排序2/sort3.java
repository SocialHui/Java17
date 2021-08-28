import java.util.Arrays;

public class sort3 {
    public static void main(String[] args) {
        //选择排序
        int[] nums = {1,4,3,5,2,7,9,1};
        sort(nums);
        System.out.println(Arrays.toString(nums));
    }

    public static void sort(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int max = 0;
            for (int j = 0; j < nums.length-i; j++) {
                if (nums[j] > nums[max]) {
                    max = j;
                }
            }
            int tmp = nums[max];
            nums[max] = nums[nums.length-i-1];
            nums[nums.length-i-1] = tmp;
        }
    }
}
