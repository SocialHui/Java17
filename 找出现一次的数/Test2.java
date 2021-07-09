class Solution {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        int num = 0;
        boolean flag = true;
        int i = 0;
        for (; i < nums.length-1; i+=2) {
            if (nums[i] != nums[i+1]) {
                //代表这个数字是要
                num = nums[i];
                flag = false;
                break;
            }
        }

        if (nums.length%2 != 0 && flag == true) {
            num = nums[nums.length-1];
        }
        return num;
    }
}