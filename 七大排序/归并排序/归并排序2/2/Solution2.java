public class Solution2 {
    public void mergeSort(int[] array, int left, int right) {
        //先分解在合并
        if (left == right) {
            return;
        }
        int mid = (left+right)/2;
        mergeSort(array,left,mid);
        mergeSort(array,mid+1,right);
        heBing(array,left,mid,right);
    }

    public void heBing(int[] array, int start, int mid, int end) {
        int[] tmp = new int[end-start+1];
        int k = 0;
        int s1 = start;
        int e1 = mid;
        int s2 = mid+1;
        int e2 = end;
        while (s1 <= e1 && s2 <= e2) {
            if (array[s1] <= array[s2]) {
                tmp[k++] = array[s1++];
            } else {
                tmp[k++] = array[s2++];
            }
        }
        while (s1 <= e1) {
            tmp[k++] = array[s1++];
        }
        while (s2 <= e2) {
            tmp[k++] = array[s2++];
        }
        for (int i = 0; i < tmp.length; i++) {
            array[start++] = tmp[i];
        }
    }
}
