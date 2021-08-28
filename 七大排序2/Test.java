import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        //快排
        int[] nums = {1,4,3,6,4,8};
        sort(nums,0,nums.length-1);
        System.out.println(Arrays.toString(nums));
    }

    public static void sort(int[] nums, int left, int right) {
        if (left >= right) {
            return;
        }
        int piv = pivot(nums,left,right);
        sort(nums,left,piv);
        sort(nums,piv+1,right);
    }


    public static int pivot(int[] nums, int left, int right) {
        int num = nums[left];
        int i = left;
        int j = right;
        while (i < j) {
            while (i < j && nums[j] >= num) {
                j--;
            }
            nums[i] = nums[j];
            while (i < j && nums[i] < num) {
                i++;
            }
            nums[j] = nums[i];
        }
        nums[i] = num;
        return i;
    }
}
