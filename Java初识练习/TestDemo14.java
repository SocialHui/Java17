import java.util.Arrays;

public class TestDemo {
    public static void main(String[] args) {
        //有一组数据，只有一个数字是出现一次，其他是两次，请找出这个数字。
        int[] arr = {1,1,2,5,3,4,4,2,5};
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i+=2) {
            if (arr[i] != arr[i+1]) {
                System.out.println(arr[i]);
                break;
            }
        }
    }
}
