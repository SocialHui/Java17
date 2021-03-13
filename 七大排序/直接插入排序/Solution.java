class Solution {
    public void sort (int[] array) {
        for (int i = 1; i < array.length; i++) {
            int tmp = array[i];
            int j = i-1;
            for (; j >= 0; j--) {
                if (array[j] > array[i]) {
                    array[j+1] = array[j];
                } else {
                    array[j+1] = tmp;
                    break;
                }
            }
            array[j+1] = tmp;
        }
    }
}
