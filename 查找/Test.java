import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        //给定一个有序整型数组, 实现二分查找
        int[] arr = {1,2,3,4,5,6,7,8,9};
        System.out.println("请输入要查找的数字");
        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();
        int num = toFind(arr,target);  //顺序查找
        if (num != -1) {
            System.out.println("这个数字的下标是：" + num);
        }

        int num1 = toFind1(arr,target);
        if (num1 != -1) {
            System.out.println("这个数字的下标是：" + num1);
        }
    }

    public static int toFind1(int[] arr,int target) {
        int left = 0;
        int right = arr.length-1;
        while (left <= right) {
            int mid = (right + left)/2;
            if (target > arr[mid]) {
                left = mid + 1;
            } else if (target < arr[mid]) {
                right = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    public static int toFind(int[] arr, int target) {   //顺序查找
        for (int i = 0; i < arr.length ; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

}
