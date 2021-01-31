import java.util.Comparator;
import java.util.PriorityQueue;

public class TestDemo {

    //找前k个最大的元素
    public static void topK (int[] array, int k) {

        //建立大小为k的小堆
        PriorityQueue<Integer> qu = new PriorityQueue<>(k, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        });

        //遍历数组
        for (int i = 0; i < array.length; i++) {
            if (qu.size() < k) {
                qu.offer(array[i]);
            } else {
                if (array[i] > qu.peek()) {
                    qu.poll();
                    qu.offer(array[i]);
                }
            }
        }

        //打印前k个最大的元素
        for (int i = 0; i < k; i++) {
            System.out.println(qu.poll());
        }
    }

    public static void main(String[] args) {
        int[] array = {1,3,8,5,7,6,9,4};
        topK(array,3);
    }
}
