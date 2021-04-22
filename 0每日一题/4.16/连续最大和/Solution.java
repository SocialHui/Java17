import java.util.*;

public class Solution{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();
            }

            int maxSum = arr[0];  //存放和最大
            for (int i = 0; i < arr.length; i++) {
                int sum = arr[i];
                if (sum > maxSum) {
                    maxSum = sum;
                }
                for (int j = i+1; j < arr.length; j++) {
                    sum += arr[j];
                    if (sum > maxSum) {
                        maxSum = sum;
                    }
                }
            }
            System.out.println(maxSum);
        }
    }
}
