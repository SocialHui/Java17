class Solution {
    public void sort (int[] array) {
        int[] gap = {5,3,1};
        for (int i = 0; i < gap.length; i++) {
            xierSort(array,gap[i]);
        }
    }

    public void xierSort(int[] array, int gap) {
        for (int i = gap; i < array.length; i++) {
            int j = i-gap;
            int tmp = array[i];
            for (; j >= 0 ; j=j-gap) {
                if (array[j] > tmp) {
                    array[j+gap] = array[j];
                } else {
                    break;
                }
            }
            array[j+gap] = tmp;
        }
    }
}
