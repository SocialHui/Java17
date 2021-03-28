public class Solution {
    public int findUnsortedSubarray(int[] nums) {
        int left = 0;
        int right = nums.length-1;
        while (left < nums.length) {
            int i = left;
            for (; i < nums.length; i++) {
                if (nums[i] < nums[left]) {
                    break;
                }
            }
            if (i == nums.length) {
                left = left+1;
            } else {
                break;
            }
        }
        while (right >= 0) {
            int i = right;
            for (; i >= 0; i--) {
                if (nums[i] > nums[right]) {
                    break;
                }
            }
            if (i == -1) {
                right = right-1;
            } else {
                break;
            }
        }
        if (left > right) {
            return 0;
        }
        return right-left+1;
    }
}