import java.util.Arrays;

public class TestDemo {
    public static void main(String[] args) {
        //调整数组顺序使得奇数位于偶数之前。调整之后，不关心大小顺序。
        int[] arr = {1,2,3,4,5,6,8};
        int left = 0;
        int right = arr.length-1;
        while (left < right) {
            if (arr[left]%2 == 0) { //代表左边是偶数，需要交换
                if (arr[right]%2 != 0) {   //代表右边是偶数，需要交换
                    int tmp = arr[left];
                    arr[left] = arr[right];
                    arr[right] = tmp;
                    left++;
                }
                right--;
            } else {
                left++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
