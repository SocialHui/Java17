import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        //冒泡排序（升序）
        int[] arr = {3,5,7,8,6,9,4,8,9,5,1,3};
        System.out.println(Arrays.toString(arr));
        bubblesort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void bubblesort(int[] arr) {
        int tmp;
        boolean tmp1 = false;
        for (int i = 0; i < arr.length-1 ; i++) {
            for (int j = 0; j < arr.length-1-i ; j++) {
                if (arr[j] > arr[j+1]) {
                    tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                    tmp1 = true;
                }
                if (tmp1 = false) {
                    break;
                }
            }
        }
    }

}
