public class Solution {
    public int FindGreatestSumOfSubArray(int[] array) {
        int sum = Integer.MIN_VALUE;
        int max = sum;
        for (int i = 0; i < array.length; i++) {
            if (sum < 0) {
                sum = array[i];
            } else {
                sum += array[i];
            }
            if (sum > max) {
                max = sum;
            }
        }
        return max;
    }
}