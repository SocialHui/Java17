import java.util.Arrays;

public class sort2 {
    public static void main(String[] args) {
        int[] nums = {1,5,4,7,3,8};
        sort(nums);
        System.out.println(Arrays.toString(nums));
    }


    public static void sort(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            int j = i-1;
            for (; j >= 0 && nums[j] > num; j--) {
                nums[j+1] = nums[j];
            }
            nums[j+1] = num;
        }
    }
}
