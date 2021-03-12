class Solution {
    public void sortColors(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            //int max = i;
            int max = 0;
            for (int j = 1; j < nums.length-i; j++) {
                if (nums[j] > nums[max]) {
                    max = j;
                }
            }
            int tmp = nums[max];
            // nums[max] = nums[j-1];
            // nums[j-1] = tmp;
            nums[max] = nums[nums.length-i-1];
            nums[nums.length-1-i] = tmp;
        }
    }
}
