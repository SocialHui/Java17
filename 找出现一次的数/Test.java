import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        //有一组数据，只有一个数字是出现一次，其他是两次，请找出这个数字。
        int[] arr = {1,6,3,3,2,4,6,4,1,7,9,9,7};
        Arrays.sort(arr);
        /*for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }*/
        for (int i = 0; i < arr.length - 1; i+=2) {
            if (arr[i] != arr[i+1]) {
                System.out.println(arr[i]);
                break;
            }
        }
    }
}
