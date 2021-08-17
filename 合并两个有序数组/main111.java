import java.util.Arrays;

public class main111 {
    public static void main(String[] args) {
        int[] nums1 = {1,3,4,0,0,0};
        int[] nums2 = {2,4,6};
        he(nums1,3,nums2,nums2.length);
        for (int i = 0; i < nums1.length; i++) {
            System.out.print(nums1[i]+" ");
        }
    }

    public static void he(int[] nums1, int m, int[] nums2, int n) {
        int[] nums = new int[nums1.length];
        int k = 0;
        int i = 0;
        int j = 0;
        while (i < m && j < n) {
            if (nums1[i] < nums2[j]) {
                nums[k++] = nums1[i++];
            } else {
                nums[k++] = nums2[j++];
            }
        }
        while (i < m) {
            nums[k++] = nums1[i++];
        }
        while (j < n) {
            nums[k++] = nums2[j++];
        }
        i = 0;
        for (; i < nums.length; i++) {
            nums1[i] = nums[i];
        }
    }
}
