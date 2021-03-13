class Solution {
    public void sort (int[] array) {
        for (int i = 0; i < array.length; i++) {
            int max = 0;
            for (int j = 0; j < array.length-i; j++) {
                if (array[j] > array[max]) {
                    max = j;
                }
            }
            int tmp = array[max];
            array[max] = array[array.length-1-i];
            array[array.length-1-i] = tmp;
        }
    }
}
