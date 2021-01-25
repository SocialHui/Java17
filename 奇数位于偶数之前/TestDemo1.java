import java.util.Arrays;

public class TestDemo {

    public static int[] transform(int[] arr){
        int left = 0;
        int right = arr.length-1;
        while (left < right) {
            if(arr[left] % 2 != 0){//左边是奇数的时候
                if (arr[right]%2 == 0){ //右边是偶数的时候
                    int tmp = arr[left];
                    arr[left] = arr[right];
                    arr[right] = tmp;
                    left++;
                }
                right--;
            }else{ //左边是偶数的时候
                if(arr[right]%2 != 0) { //右边是奇数的时候
                    right--;
                }
                left++;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        //给定一个整形数组，将所有的偶数放在前半部分，所有的奇数放在后半部分
        int[] arr = {1,2,3,4,6};
        System.out.println(Arrays.toString(arr));
        transform(arr);
        System.out.println(Arrays.toString(arr));
    }
}
