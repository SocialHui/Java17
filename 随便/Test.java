import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        //给定整型数组, 把所有的偶数放到数组前面, 把所有奇数放到数组后面
        int[] arr = {1,2,3,4,5,6};
        ch(arr);
    }

    public static void ch(int[] arr) {
        int tmp;
        int left = 0;
        int right = arr.length-1;
        while (left < right) {
            tmp = arr[left];
            arr[left] = arr[right];
            arr[right] = tmp;

            if (arr[left] % 2 == 0) {
                left++;
            }
            if (arr[right] % 2 !=0) {
                right--;
            }

        }
        System.out.println(Arrays.toString(arr));
    }

}
