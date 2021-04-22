import java.util.*;

public class Solution{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();  //代表这个数组的大小
            int[] arr = new int[n];
            int i = 0;
            while (i < n) {
                arr[i++] = sc.nextInt();
            }
            //此时已经将所有的数字都放在数组中了
            //接下来要判断最少分为几组
            i = 0;
            int sum = 0;
            while (i < arr.length) {
                int num = arr[i];
                i++;
                if (i < arr.length) {
                    if (arr[i] > arr[i - 1]) {
                        //递增
                        while (i < arr.length && arr[i] >= arr[i - 1]) {
                            i++;
                        }
                        sum++;
                    } else if (arr[i] < arr[i - 1]) {
                        //递减
                        while (i < arr.length && arr[i] <= arr[i - 1]) {
                            i++;
                        }
                        sum++;
                    } else {
                        //此时就是两个数相等的时候，相等的时候需要判断到底是递增还是递减
                        while (i < arr.length && arr[i] == arr[i - 1]) {
                            i++;
                        }
                        if (i >= arr.length) {
                            break;
                        } else {
                            if (arr[i] > arr[i - 1]) {
                                //递增
                                while (i < arr.length && arr[i] >= arr[i - 1]) {
                                    i++;
                                }
                                sum++;
                            } else {
                                //递减
                                while (i < arr.length && arr[i] <= arr[i - 1]) {
                                    i++;
                                }
                                sum++;
                            }
                        }
                    }
                } else {
                    sum++;
                }
            }
            System.out.println(sum);
        }
    }
}

