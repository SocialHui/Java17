public class Solution {
    public void sort(int[] array) {
        quickSort(array,0,array.length-1);
    }

    public void quickSort(int[] array,int left, int right) {
        if (left >= right) {
            return;
        }
        int piv = pivot(array,left,right);
        quickSort(array,left,piv-1);
        quickSort(array,piv+1,right);
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
