import java.util.Arrays;
import java.util.Stack;

public class TestDemo {
    public static void main(String[] args) {
        int[] array = {5,6,7,2,8,9,1,3,6,4};
        quickSort(array);
        System.out.println(Arrays.toString(array));
    }

    public static int pivot(int[] array, int start, int end) {
        int tmp = array[start];
        while (start < end) {
            while (start < end && array[end] >= tmp) {
                end--;
            }
            array[start] = array[end];
            while (start < end && array[start] <= tmp) {
                start++;
            }
            array[end] = array[start];
        }
        array[start] = tmp;
        return start;
    }

    public static void quickSort(int[] array) {
        Stack<Integer> stack = new Stack<>();
        int low = 0;
        int high = array.length-1;
        int piv = pivot(array,low,high);
        if (piv > low+1){ //代表左边有两个元素，不一定有序
            stack.push(low);
            stack.push(piv-1);
        }
        if (piv < high -1) {
            stack.push(piv+1);
            stack.push(high);
        }

        while (!stack.isEmpty()) {
            high = stack.pop();
            low = stack.pop();
            piv = pivot(array,low,high);
            if (piv > low+1){ //代表左边有两个元素，不一定有序
                stack.push(low);
                stack.push(piv-1);
            }
            if (piv < high -1) {
                stack.push(piv+1);
                stack.push(high);
            }
        }
    }
}