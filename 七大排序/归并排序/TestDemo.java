import java.util.Arrays;

public class TestDemo {
    public static void main(String[] args) {
        int[] array = {2,8,6,4,9,7,2,3,6,4,1,5};
        System.out.println(Arrays.toString(array));
        mergeSort(array,0,array.length-1);
        System.out.println(Arrays.toString(array));
    }

    //分解
    public static void mergeSort(int[] array, int low, int high) {
        if (low >= high) return;
        int mid = (low+high)/2;
        mergeSort(array,low,mid);
        mergeSort(array,mid+1, high);
        //在这里已经分为单独的数据了
        //合并的操作
        merge(array, low, mid, high);
    }

    //合并
    public static void merge(int[] array, int low, int mid, int high) {
        int s1 = low;
        int e1 = mid;
        int s2 = mid+1;
        int e2 = high;
        int[] tmp = new int[high-low+1];
        int k = 0;//tmp数组的下标
        while (s1 <= e1 && s2 <= e2) {
            if (array[s1] <= array[s2]) {
                tmp[k] = array[s1];
                k++;
                s1++;
            }
            if (array[s2] < array[s1]) {
                tmp[k] = array[s2];
                k++;
                s2++;
            }
        }
        //
        while (s1 <= e1) {
            tmp[k] = array[s1];
            k++;
            s1++;
        }
        while (s2 <= e2) {
            tmp[k] = array[s2];
            k++;
            s2++;
        }
        for (int i = 0; i < tmp.length; i++) {
            array[i+low] = tmp[i];
        }
    }
}
