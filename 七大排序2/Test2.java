import java.util.Arrays;

public class Test1 {
    public static void main(String[] args) {
        int[] nums = {1,1,4,3,7,6,8,1};
        sort(nums,0,nums.length-1);
        System.out.println(Arrays.toString(nums));
    }

    //归并排序
    public static void sort(int[] nums, int left, int right) {
        if (left >= right) {
            return;
        }
        int mid = (left+right)/2;
        sort(nums,left,mid);
        sort(nums,mid+1,right);

        //去合并
        he(nums,left,right,mid);
    }

    public static void he(int[] nums, int left, int right, int mid){
        int[] tmps = new int[right-left+1];
        int i = left;
        int j = mid+1;
        int k = 0;
        while (i <= mid && j <= right) {
            while (i <= mid && nums[i] <= nums[j]) {
                tmps[k++] = nums[i++];
            }
            while (j <= right && nums[j] < nums[i]) {
                tmps[k++] = nums[j++];
            }
        }
        while (i <= mid) {
            tmps[k++] = nums[i++];
        }
        while (j <= right) {
            tmps[k++] = nums[j++];
        }
        k = 0;
        for (; k < tmps.length; k++) {
            nums[left++] = tmps[k];
        }
    }
}
