import java.util.Stack;

public class Solution {
    public void sort(int[] array) {
        quickSort(array,0,array.length-1);
    }

    public void quickSort(int[] array, int left, int right) {
        Stack<Integer> stack = new Stack<>();
        int piv = pivot(array,left,right);
        if (piv-1 > left) {
            stack.push(left);
            stack.push(piv-1);
        }
        if (piv+1 < right) {
            stack.push(piv+1);
            stack.push(right);
        }
        while (!stack.isEmpty()) {
            right = stack.pop();
            left = stack.pop();
            piv = pivot(array,left,right);
            if (piv-1 > left) {
                stack.push(left);
                stack.push(piv-1);
            }
            if (piv+1 < right) {
                stack.push(piv+1);
                stack.push(right);
            }
        }
    }

    public int pivot(int[] array, int left, int right) {
        int tmp = array[left];
        while (left < right) {
            while (left < right && array[right] >= tmp) {
                right--;
            }
            array[left] = array[right];
            while (left < right && array[left] <= tmp) {
                left++;
            }
            array[right] = array[left];
        }
        array[left] = tmp;
        return left;
    }
}
