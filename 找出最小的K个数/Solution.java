package thread.thread0810;

import java.util.ArrayList;
import java.util.*;

public class Solution {
    //要找出k个最小的数，所以需要建大堆
    public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
        ArrayList<Integer> list = new ArrayList<>();
        if (k > 0) {
            PriorityQueue<Integer> queue = new PriorityQueue<>(k,new Comparator<Integer>() {
                @Override
                public int compare(Integer o1, Integer o2) {
                    return o2-o1;
                }
            });

            for (int i = 0; i < input.length; i++) {
                if (queue.size() < k) {
                    queue.offer(input[i]);
                } else {
                    int num = queue.peek();
                    if (input[i] < num) {
                        queue.poll();
                        queue.offer(input[i]);
                    }
                }
            }

            while (!queue.isEmpty()) {
                list.add(queue.poll());
            }
        }

        return list;
    }
}
