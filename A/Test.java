import java.util.Arrays;

public class Test {

    public static void main(String[] args) {
        //数组转字符串
        int[] array = {1,8,5,6,4,7,9,3};
        String str = "[";
        for (int i = 0; i < array.length; i++) {
            if (i != array.length-1) {
                str = str + array[i] + ",";
            } else {
                str = str + array[i];
            }
        }
        str = str + "]";
        System.out.println(str);
    }

    public static void main3(String[] args) {
        //二分查找
        int[] array = {1,8,5,6,4,7,9,3};
        int tmp = 6;
        Arrays.sort(array);
        System.out.println(search(array, tmp));
    }

    public static int search(int[] array, int tmp) {
        int left = 0;
        int right = array.length-1;
        while (left <= right) {
            int mid = (left+right)/2;
            if (array[mid] == tmp) {
                return mid;
            } else if (tmp > array[mid]) {
                left = mid + 1;
            } else {
                right = mid -1;
            }
        }
        return -1;
    }

    public static void main2(String[] args) {
        //判断数组是否有序
        int[] array = {1,3};
        System.out.println(adjuct(array));
    }

    public static boolean adjuct(int[] array) {
        for (int i = 0; i < array.length-1; i++) {
            if (array[i] > array[i+1]){
                return false;
            }
        }
        return true;
    }

    public static void main1(String[] args) {
        //冒泡排序
        int[] array = {1,8,5,6,4,7,9,3};
        System.out.println(Arrays.toString(array));
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length-1-i; j++) {
                if (array[j] > array[j+1]){
                    int tmp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = tmp;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
