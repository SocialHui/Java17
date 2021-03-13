public class Solution1 {

    public void sort(int[] array,int left, int right) {
        if (left < right) {
            int piv = swap(array,left,right);
            //左边递归
            sort(array,0,piv-1);
            //右边递归
            sort(array,piv+1,right);
        }
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
