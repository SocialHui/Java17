import java.util.PriorityQueue;

public class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> qu = new PriorityQueue<>((i1,i2) -> i2-i1);
        for (int i : stones)  {
            qu.offer(i);
        }
        while (qu.size() >= 2) {
            int x = qu.poll();
            int y = qu.poll();
            if (x > y)
                qu.offer(x - y);
        }
        return qu.size() == 1 ? qu.peek() : 0;
    }
}
