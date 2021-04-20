import java.util.*;

public class Solution{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String str = sc.nextLine();
            String[] strs = str.split(" ");
            int[] arr = new int[strs.length-1];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = Integer.parseInt(strs[i]);
            }
            int n = Integer.parseInt(strs[strs.length-1]);

            //需要建立的是一个大堆
            PriorityQueue<Integer> queue = new PriorityQueue<>(n, new Comparator<Integer>() {
                @Override
                public int compare(Integer o1, Integer o2) {
                    return o2-o1;
                }
            });
            for (int i = 0; i < arr.length; i++) {
                if (queue.size() < n) {
                    queue.offer(arr[i]);
                } else {
                    //如果优先级队列已经满了，需要判断最顶端的那个数字是否比接下来的这个数字小，如果
                    if (queue.peek() > arr[i]) {
                        queue.poll();
                        queue.offer(arr[i]);
                    }
                }
            }

            //到这以后优先级队列里面放的就是n个最小的值
            Stack<Integer> stack = new Stack<>();
            for (int i = 0; i < n; i++) {
                stack.push(queue.poll());
            }
            while (!stack.isEmpty()) {
                System.out.print(stack.pop());
                System.out.print(" ");
            }
        }
    }
}