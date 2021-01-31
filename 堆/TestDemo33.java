import java.util.Comparator;
import java.util.PriorityQueue;

public class TestDemo {
    public static void main(String[] args) {
        /**
         * PriorityQueue 底层默认是小根堆的方式存储
         */
//        PriorityQueue<Integer> qu = new PriorityQueue<>();
//        qu.offer(10);
//        qu.offer(20);
//        qu.offer(30);

        /**
         * 实现大根堆的方法
         * 以下代码可实现小根堆或者大根堆的任一种 new Comparator<Integer>
         *     return 0   代表小根堆的存储方式
         *     return o1 - o2 代表小根堆方式进行调整
         *     return o2 - o1 代表大根堆方式进行调整
         */
        PriorityQueue<Integer> qu = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return 0;
            }
        });
        qu.offer(10);
        qu.offer(20);
        qu.offer(30);
    }
}
