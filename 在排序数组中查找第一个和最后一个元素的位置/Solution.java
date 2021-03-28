public class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] tmp = {-1,-1};
        int left = 0;
        int right = nums.length-1;
        while (left <= right) {
            int min = (left + right)/2;
            if (target > nums[min]) {
                left = min +1;
            } else if (target < nums[min]) {
                right = min-1;
            } else {
                int n = min;
                while (n >= 0 && nums[n] == target) {
                    n--;
                }
                tmp[0] = n+1;
                n = min;
                while (n <= nums.length-1 && nums[n] == target) {
                    n++;
                }
                tmp[1] = n-1;
                break;
            }
        }
        return tmp;
    }
}

