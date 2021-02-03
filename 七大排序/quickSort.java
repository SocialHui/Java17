import java.util.Arrays;

public class TestDemo {
    public static void main(String[] args) {
        int[] array = {1,2,5,43,8,9,5,7,6};
        System.out.println(Arrays.toString(array));
        quickSort(array);
        System.out.println(Arrays.toString(array));
    }

    public static int pivot (int[] array, int start, int end) {
        int tmp = array[start];
        while (start < end) {
            while (array[end] >= tmp && start < end) {
                end--;
            }
            if (start >= end) {
                //array[start] = tmp;
                break;
            } else {
                array[start] = array[end];
            }

            while (array[start] <= tmp && start < end) {
                start++;
            }
            if (start >= end) {
                //array[start] = tmp;
                break;
            } else {
                array[end] = array[start];
            }
            array[end] = array[start];
        }
        array[start] = tmp;
        return start;
    }

    public static void quick(int[] array, int low, int high) {
        if (low < high) {
            int piv = pivot(array, low, high);
            quick(array,low,piv-1);
            quick(array,low+1, high);
        }
    }

    public static void quickSort(int[] array) {
        quick(array,0,array.length-1);
    }

}