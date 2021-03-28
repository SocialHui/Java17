import java.util.Arrays;
import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Set;

public class Solution {
    public int thirdMax(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }
        Object[] otmp = set.toArray();
        int[] tmp = new int[otmp.length];
        for (int i = 0; i < tmp.length; i++) {
            tmp[i] = (int)otmp[i];
        }
        if (tmp.length <= 3) {
            Arrays.sort(tmp);
            return tmp[tmp.length-1];
        }

        PriorityQueue<Integer> queue = new PriorityQueue<>(3);
        for (int i = 0; i < tmp.length; i++) {
            if (queue.size() < 3) {
                queue.offer(tmp[i]);
            } else {
                if (queue.peek() < tmp[i]) {
                    queue.poll();
                    queue.offer(tmp[i]);
                }
            }
        }
        return queue.peek();
    }
}
