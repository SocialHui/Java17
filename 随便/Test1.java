import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        //主要元素
        //数组中占比超过一半的元素称之为主要元素。
        //给定一个整数数组，找到他们的主要元素。若没有，则返回-1
        int[] arr = {1,2,5,9,5,9,5,5,5,6,6,6,6,6,6,6,6,6};
        Arrays.sort(arr);
        int num = main1(arr);
        System.out.println(num);
    }

    public static int main1(int[] arr) {
        int n = arr.length/2;
        for (int i = 0; i <= arr.length/2+1 ; i++) {
            if (arr[i] == arr[n]) {
                return arr[i];
            }
        }
        return -1;
    }

}
