import java.util.Arrays;

public class Main1 {
    public static void main(String[] args) {
        //数组数字排列
        //将偶数放在数组的前半部分，奇数放在数组的后半部分
        int[] arr = {1,2,3,4};
        transform(arr);
        print(arr);
    }

    private static void transform(int[] arr) {
        int left = 0;
        int right = arr.length-1;
        while (left <= right) {
            while (left <= right && arr[left]%2 == 0) {
                //代表不需要将这个数字放到后半部分
                left++;
            }
            while (left <= right && arr[right]%2 != 0) {  //代表这个数字是一个奇数
                //代表不需要将这个数字放到数组的前面
                right--;
            }
            if (left <= right) {
                int tmp = arr[left];
                arr[left] = arr[right];
                arr[right] = tmp;
                left++;
                right--;
            }
        }
    }

    private static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
