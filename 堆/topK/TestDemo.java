import java.util.Comparator;
import java.util.PriorityQueue;

public class TestDemo {

    //找前k个最大的
    public static void topK(int[] array, int k) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>(k, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1-o2; //小堆
            }
        });
        for (int i = 0; i < array.length; i++) {
            if (minHeap.size() < k) {
                minHeap.offer(array[i]);
            } else {
                if (minHeap.peek() < array[i]) {
                    minHeap.poll();
                    minHeap.offer(array[i]);
                }
            }
        }
        for (int i = 0; i < k; i++) {
            System.out.print(minHeap.poll()+" ");
        }
    }

    public static void main(String[] args) {
        int[] array = {27,15,19,18,28,34,65,49,25,37};
        topK(array,3);
    }
}
