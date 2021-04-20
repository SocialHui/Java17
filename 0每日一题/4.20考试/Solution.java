import java.util.*;

public class Solution{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int num=sc.nextInt();
            int arr[]=new int[num];
            int i=0;
            while(i<num){
                arr[i]=sc.nextInt();
                i++;
            }
            Queue<Integer> q = new LinkedList<>();
            Arrays.sort(arr);
            int nums = 1; //代表当前这个数字有几个
            int j = 0;
            while (j < arr.length){
                int number = arr[j];
                j++;
                while (j < arr.length && arr[j] == number) {
                    j++;
                    nums++;
                }
                if (nums%2 != 0) {
                    //代表这个数字不是偶数个
                    q.offer(number);
                }
                nums = 1;
            }
            while (!q.isEmpty()) {
                System.out.print(q.poll() + " ");
            }
        }
    }
}