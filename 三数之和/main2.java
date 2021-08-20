class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> list = new ArrayList<>();
        if (nums.length < 3 || nums[0] > 0 || nums[nums.length-1] < 0) {
            return list;   //排除所有的数字都比0大，和不可能为0
        }

        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            if (num > 0) {
                break;
            }  //如果第一个数字都比0大，那么后面的数字都比0大

            //重点重点！！！！！！！！！！
            //下面的循环里面没有判断到第一个值和第二个值相等的情况
            if (i > 0 && nums[i-1] == nums[i]) {
                continue;
            }

            int left = i+1;
            int right = nums.length-1;

            while (left < right) {
                int sum = num+nums[left]+nums[right];
                if (sum < 0) {
                    left++;
                } else if (sum > 0) {
                    right--;
                } else {
                    //到这里代表这三个数的和是符合要求的
                    List<Integer> list1 = new ArrayList<>();
                    list1.add(num);
                    list1.add(nums[left]);
                    list1.add(nums[right]);
                    list.add(list1);
                    left++;
                    right--;
                    //到了这里就需要排除重复的情况
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