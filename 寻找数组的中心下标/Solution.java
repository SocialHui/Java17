class Solution {
    public int pivotIndex(int[] nums) {
        int total = 0;
        for (int i = 0; i < nums.length; i++) {
            total = total+nums[i];
        }
        //int total = Arrays.stream(nums).sum();
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (sum*2+nums[i] == total) {
                return i;
            }
            sum = sum+nums[i];
        }
        return -1;
    }
}