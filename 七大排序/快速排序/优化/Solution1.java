public class Solution1 {

    /**
     * 在数据有序的情况下，快速排序的时间复杂度达到n的平方
     * 所以为了优化
     * 采用三数取中的方法来选取基准
     * @param array
     * @param left
     * @param right
     */

    public void sort(int[] array,int left, int right) {
        if (left < right) {
            //三数取中
            three(array, left, right, (left+right)/2);
            int piv = swap(array,left,right);
            //左边递归
            sort(array,0,piv-1);
            //右边递归
            sort(array,piv+1,right);
        }
    }

    public void three(int[] array, int left, int right, int mid) {
        if (array[left] < array[mid]) {
            huan(array,left,right);
        }
        if (array[left] > array[right]) {
            huan(array,left,right);
        }
        if (array[mid] > array[right]) {
            huan(array,left,right);
        }
    }

    public void huan(int[] arr, int left, int right) {
        int tmp = arr[left];
        arr[left] = arr[right];
        arr[right] = tmp;
    }

    //找基准
    public int swap(int[] arr, int left, int right){
        int gap = arr[left];
        while (left < right) {
            while (left < right && arr[right] >= gap) {
                right--;
            }
            arr[left] = arr[right];

            while (left < right && arr[left] <= gap) {
                left++;
            }
            arr[right] = arr[left];
        }
        arr[left] = gap;
        return right;
    }
}
