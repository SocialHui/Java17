import java.util.Arrays;

public class TestDemo {
    public static void main(String[] args) {
        int[] array = {1,2,5,43,8,9,5,7,6};
        System.out.println(Arrays.toString(array));
        shellSort(array);
        System.out.println(Arrays.toString(array));
    }

    public static void shellSort (int[] array) {
        int[] drr = {5,3,1}; //增量排序,代表每组的数据越来越多
        int len = 0;
        while (len < drr.length) {
            int gap = drr[len];
            for (int i = gap; i < array.length; i++) {
                int tmp = array[i];
                int j = i-gap;
                for (; j >=0 ; j-=gap) {
                    if (array[j] > tmp) {
                        array[j+gap] = array[j];
                    } else {
                        array[j+gap] = tmp;
                        break;
                    }
                }
                array[j+gap] = tmp;
            }
            len++;
        }
    }
}