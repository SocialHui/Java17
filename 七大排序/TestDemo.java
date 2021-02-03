import java.util.Arrays;

public class TestDemo {
    public static void main(String[] args) {
        int[] array = {1,2,5,4,9,6,7};
        System.out.println(Arrays.toString(array));
//        heapSort(array);
//        System.out.println(Arrays.toString(array));
        heapSort1(array);
        System.out.println(Arrays.toString(array));
    }

    public static void heapSort (int[] array) {
        //从小到大排序
        for (int i = 1; i < array.length; i++) {
            int tmp = array[i];
            int j = i-1;
            for (; j >= 0; j--) {
                if (array[j] > tmp) {
                    array[j+1] = array[j];
                } else {
                    array[j+1] = tmp;
                    break;
                }
            }
            array[j+1] = tmp;
        }
    }

    public static void heapSort1(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int tmp = array[i];
            int j = i-1;
            for (; j >= 0 && array[j] > tmp; j--) {
                 array[j+1] = array[j];
            }
            array[j+1] = tmp;
        }
    }

}