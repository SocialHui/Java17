import java.awt.*;
import java.util.Arrays;
import java.util.Random;

public class TestDemo {

    public static void main1(String[] args) {
        Solution solution = new Solution();
        int[] array = {1,3,5,7,9,11,12,15};
        solution.findClosestElements(array, 5, 9);
    }

    public static void main(String[] args) {
//        int[] array = {1,2,5,43,8,9,5,7,6};
//        System.out.println(Arrays.toString(array));
        int[] array = new int[1_0000];
        Random random = new Random();
        for (int i = 0; i < 1_0000; i++) {
            array[i] = random.nextInt(1000);
        }
        quickSort(array);
        System.out.println(Arrays.toString(array));
    }

    //找基准的过程
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

    public static void swap(int[] array, int k, int i) {
        int tmp = array[k];
        array[k] = array[i];
        array[i] = tmp;
    }

    public static void medianOfThree(int[] array, int low, int high) {
        int mid = (low+high)/2;
        if (array[low] < array[mid]) {
            swap(array,low,mid);
        }//array[mid] <= array[low]
        if (array[low] > array[high]){
            swap(array,low,high);
        }//array[low] <= array[high]
        if (array[mid] > array[high]){
            swap(array,mid,high);
        }//array[mid] <= array[high]
    }

    public static void insertSortBound (int[] array, int low, int high) {
        for (int i = low+1; i <= high; i++) {
            int tmp = array[i];
            int j = i-1;
            for (; j >= low; j--) {
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

    public static void quick(int[] array, int low, int high) {
        if (low >= high) return;
        if (high - low + 1 <= 50) {
            //第二个优化，数据很少的时候进行直接插入排序
            //越有序直接插入有序越快
            insertSortBound(array,low,high);
            return;//这里全部已经有序，直接结束，不不需要进行下面的递归
        }
        //在这里可以进行优化
        //第一个优化：三数取中进行优化
        //medianOfThree(array,low,high);
        int piv = pivot(array, low, high);
        quick(array, low, piv - 1);
        quick(array, low + 1, high);

    }

    public static void quickSort(int[] array) {
        quick(array,0,array.length-1);
    }
}