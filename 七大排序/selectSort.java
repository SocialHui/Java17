import java.util.Arrays;

public class TestDemo {
    public static void main(String[] args) {
        int[] array = {1,2,5,43,8,9,5,7,6};
        System.out.println(Arrays.toString(array));
        selectSort(array);
        System.out.println(Arrays.toString(array));
    }

    public static void selectSort(int[] array) {
        for (int i = 0; i < array.length-1; i++) {
            for (int j = i+1; j < array.length; j++) {
                int min = array[i];
                if (array[j] < min) {
                    array[i] = array[j];
                    array[j] = min;
                }
            }
        }
    }

}