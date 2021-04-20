import java.util.*;

public class Solution{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        while (sc.hasNext()){
            int n = sc.nextInt();
            int[] arr = new int[n];
            int i = 0;
            while (i < n) {
                arr[i++] = sc.nextInt();
            }
            int left = -1;
            int right = -1;
            for (int m = 0; m < arr.length; m++) {
                int number = arr[m];
                int j = m-1;
                //判断左边有没有比这个数小的数字
                while (j >= 0) {
                    if (arr[j] < number) {
                        left = j;
                        break;
                    }
                    j--;
                }

                //判断右边有没有比他小的数字
                j = m+1;
                while (j < arr.length) {
                    if (arr[j] < number) {
                        right = j;
                        break;
                    }
                    j++;
                }
                System.out.print(left);
                System.out.print(" ");
                System.out.print(right);
                System.out.println();
                left = -1;
                right = -1;
            }
        }
    }
}