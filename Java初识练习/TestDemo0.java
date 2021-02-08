import java.util.Arrays;

public class TestDemo {

    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6};
        print(array);
    }

    public static void print (int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static void main2(String[] args) {
        //改变原有数组的值
        int[] array = {1,2,3,4,5,6};
        System.out.println(Arrays.toString(array));
        change(array);
        System.out.println(Arrays.toString(array));
    }

    public static void change (int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = 2*array[i];
        }
    }

    public static void main1(String[] args) {
        //求数组的平均值
        int[] array = {1,2,3,4,5,6};
        System.out.println(avg(array));
    }

    public static double avg (int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum*1.0/array.length;
    }
}



