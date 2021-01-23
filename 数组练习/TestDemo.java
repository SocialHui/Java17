import java.util.Arrays;
import java.util.Scanner;

public class TestDemo {

    public static String toString(int[] arr) {
        if (arr == null){
            return null;
        }
        String ret = "[";
        for (int i = 0; i < arr.length; i++) {
            ret += arr[i];
            ret += ",";
        }
        ret += "]";
        return ret;
    }

    public static void main(String[] args) {
        int[] arr = new int[10];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;
        int[] arr2 = new int[10];
        //arr2 = Arrays.copyOf(arr,arr.length);
        //System.out.println(Arrays.toString(arr2));
        //System.arraycopy(arr,0,arr2,0,arr.length);
        //System.out.println(Arrays.toString(arr2));
        arr2 = arr.clone();
        System.out.println(Arrays.toString(arr2));
        System.out.println(toString(arr2));
    }

    public static void main1(String[] args) {
        int[] arr = new int[10];
        int[] arr1 = {1,2,3,4,5,6};
        int[] arr2 = new int[]{1,2,3,4,5,6};
        for (int x:arr1) {
            System.out.println(x);
        }
        System.out.println(Arrays.toString(arr1));
        String str = Arrays.toString(arr1);//将数组转换成字符串
        System.out.println(str);
        System.out.println(toString(arr1));//自己实现一个toString方法

    }
}
