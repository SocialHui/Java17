import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        //实现一个方法 copyOf, 对一个整型数组进行拷贝, 得到一个新的数组.
        int[] arr = {1,2,3,4,5,6};
        int[] arr1 = new int[arr.length];  //第一种拷贝方法：for循环拷贝
        System.out.println(Arrays.toString(copyOf(arr,arr1)));

        int[] arr2 = Arrays.copyOf(arr,arr.length);//第二种拷贝方法：数组的工具类拷贝
        System.out.println(Arrays.toString(arr2));

        int[] arr3 = new int[arr.length];//第三种拷贝方法
        System.arraycopy(arr,0,arr3,0,arr.length);
        System.out.println(Arrays.toString(arr3));

        int[] arr4 = arr.clone();  //第四种拷贝方法
        System.out.println(Arrays.toString(arr4));
    }

    public static int[] copyOf(int[] arr,int[] arr1) {
        for (int i = 0; i < arr.length ; i++) {
            arr1[i] = arr[i];
        }
        return arr1;
    }

}
