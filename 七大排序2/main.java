import java.util.Arrays;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String str = sc.nextLine();
            str = str.substring(1,str.length()-1);
            String[] strs = str.split(", ");
            int[] nums = new int[strs.length];
            for (int i = 0; i < nums.length; i++) {
                nums[i] = Integer.parseInt(strs[i]);
            }
            sort(nums,0,nums.length-1);
            System.out.println(Arrays.toString(nums));
        }
    }

    public static void sort(int[] nums, int left, int right) {
        if (left >= right) {
            return;  //代表两个数字已经是相邻的了，可以进行归并排序了
        }
        int mid = (left+right)/2;
        sort(nums,left,mid);
        sort(nums,mid+1, right);
        //接下来就可以进行归并了
        gui(nums,left,right,mid);
    }

    public static void gui(int[] nums, int left, int right, int mid) {
        int i = left;
        int j = mid+1;
        int[] tmps = new int[right-left+1];
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
        while (k < tmps.length) {
            nums[left++] = tmps[k++];
        }
    }
}
