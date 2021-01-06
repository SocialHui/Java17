import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {6,7,8,9,10};
        exchange(arr1,arr2);
    }

    public static void exchange(int[] arr1,int[] arr2) {
        int tmp;
        for (int i = 0; i < arr1.length ; i++) {
            tmp = arr1[i];
            arr1[i] = arr2[i];
            arr2[i] = tmp;
        }
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
    }

}
