class Solution {
    public int findKthLargest(int[] nums, int k) {
        //创建大小为k的小堆
        PriorityQueue<Integer> queue = new PriorityQueue<>(k);
        for (int i = 0; i < nums.length; i++) {
            if (queue.size() != k) {
                queue.offer(nums[i]);
            } else if (queue.peek() < nums[i]) {
                queue.poll();
                queue.offer(nums[i]);
            }
        }
        return queue.peek();
    }
}