import java.util.*;

public class Solution{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = i;
            }
            Queue<Integer> q1 = new LinkedList<>();
            Queue<Integer> q2 = new LinkedList<>();

            //先将所有的数字都g放在q1中
            for (int i = 0; i < arr.length; i++) {
                q1.offer(arr[i]);
            }

            int i = 0;
            int num = 0;  //用来计数的，计算现在间隔了几个数字
            while (q1.size()+q2.size() != 1){

                while (!q1.isEmpty()) {
                    if (num == 2) {
                        //代表这个数字是要被删除的
                        q1.poll();
                        num = 0;
                    } else {
                        q2.offer(q1.poll());
                        num++;
                    }
                }
                
                while (!q2.isEmpty()) {
                    if (num == 2) {
                        //代表这个数字是要被删除的
                        q2.poll();
                        num = 0;
                    } else {
                        q1.offer(q2.poll());
                        num++;
                    }
                }
            }
            if (q1.isEmpty()) {
                System.out.println(q2.poll());
            } else {
                System.out.println(q1.poll());
            }
        }
    }
}