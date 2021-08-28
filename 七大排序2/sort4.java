import java.util.Arrays;

public class sort4 {
    public static void main(String[] args) {
        //直接插入排序
        int[] nums = {1,3,5,2,7};
        sort(nums);
        System.out.println(Arrays.toString(nums));
    }

    public static void sort(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            int j = i-1;
            int num = nums[i];
            for (; j >= 0 && nums[j] > num; j--) {
                nums[j+1] = nums[j];
            }
            nums[j+1] = num;
        }
    }

}
