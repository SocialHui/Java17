import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class TestDemo {
    /**
     * 找前k个最大的元素
     * 建小堆
     * @param array
     */
    public static void topK(int[] array, int k){
        PriorityQueue<Integer> qu = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
                //return o2 - 01;这是大根堆
            }
        });

        //如果数组的长度比K小或者等于K，就不用创建推，直接输出
        if (array.length < k) {
            System.out.println(Arrays.toString(array));
        }


        for (int i = 0; i < array.length; i++) {
            //把前k个建堆
            if (qu.size() < k) {
                qu.offer(array[i]);
            } else {
                //比较过程
                if (qu.size() != 0) {
                    if (array[i] > qu.peek()) {
                        qu.poll();
                        qu.offer(array[i]);
                    }
                }
            }
        }

        //打印前k个最值
        for (int i = 0; i < k; i++) {
            System.out.println(qu.poll());
        }

    }


    public static void main1(String[] args) {
        int[] array = {1,2,3,4,5,9,6,0,10,7,20};
        topK(array,3);
    }
}
