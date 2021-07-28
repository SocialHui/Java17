class Solution {
    public int singleNumber(int[] nums) {
        //排序解决
        // Arrays.sort(nums);
        // int i = 0;
        // for (; i < nums.length; i+=2){
        //     if (i+1 < nums.length && nums[i] != nums[i+1]) {
        //         return nums[i];
        //     }
        // }
        // return nums[i-2];
        
        //用HashMap解决
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                map.put(nums[i],map.get(nums[i])+1);
            } else {
                map.put(nums[i],1);
            }
        }

        //再来一个循环判断map里面哪个key的值对应的value是1就返回
        int result = -1;
        for(Map.Entry<Integer,Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                result = entry.getKey();
            }
        }
        return result;
    }
}