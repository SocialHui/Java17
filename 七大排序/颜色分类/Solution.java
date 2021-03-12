class Solution {
    public void sortColors(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            int tmp = nums[i];
            int j = i-1;
            for (; j >= 0; j--) {
                if (nums[j] > tmp) {
                    nums[j+1] = nums[j];
                } else {
                    nums[j+1] = tmp;
                    break;
                }
            }
            nums[j+1] = tmp;
        }
    }
}
