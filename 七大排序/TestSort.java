import java.util.Arrays;

public class TestSort {

    public static void insertSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int tmp = array[i];
            int j = i-1;
            for (; j >= 0 ; j--) {
                if (array[j] > tmp) {
                    array[j+1] = array[j];
                } else {
                    //array[j+1] = tmp;
                    break;
                }
            }
            array[j+1] = tmp;
        }
        System.out.println(Arrays.toString(array));
    }


    public static void main(String[] args) {
        int[] array = {10,20,5,6,30,7,8,9};
        insertSort(array);
    }

}
