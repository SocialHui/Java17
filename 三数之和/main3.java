class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> list = new ArrayList<>();
        if (nums.length == 0 || nums[0] > 0 || nums[nums.length-1] < 0 || nums.length < 3) {
            return list;
        }
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            if (num > 0) {
                break;
            }
            int left = i+1;
            int right = nums.length-1;

            if (i > 0 && nums[i-1] == nums[i]) {
                continue;
            }

            while (left < right) {
                int sum = num+nums[left]+nums[right];
                if (sum < 0) {
                    left++;
                } else if (sum > 0) {
                    right--;
                } else {
                    List<Integer> list1 = new ArrayList<>();
                    list1.add(num);
                    list1.add(nums[left]);
                    list1.add(nums[right]);
                    list.add(list1);
                    left++;
                    right--;
                    while (left < right && nums[left-1] == nums[left]) {
                        left++;
                    }
                    while (left < right && nums[right+1] == nums[right]) {
                        right--;
                    }
                }
            }
        }
        return list;
    }
}