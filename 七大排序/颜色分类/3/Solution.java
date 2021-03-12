class Solution {
    public void sortColors(int[] nums) {
        int[] arr = {5,3,1};
        for (int i = 0; i < arr.length; i++) {
            sort(nums, arr[i]);
        }
    }

    public void sort(int[] nums, int gap) {
        for (int i = gap; i < nums.length; i++) {
            int tmp = nums[i];
            int j = i - gap;
            for (; j >= 0; j = j-gap) {
                if (nums[j] > tmp) {
                    nums[j+gap] = nums[j];
                } else {
                    break;
                }
            }
            nums[j+gap] = tmp;
        }
    }
}
