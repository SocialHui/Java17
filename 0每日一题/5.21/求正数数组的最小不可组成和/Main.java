public class Solution {
	/**
	 *	正数数组中的最小不可组成和
	 *	输入：正数数组arr
	 *	返回：正数数组中的最小不可组成和
	 */
	public int getFirstUnFormedNum(int[] arr) {
        int min = Integer.MAX_VALUE;
        int max = 0;
        for (int i: arr) {
            min = Math.min(i,min);
            max += i;
        }
        boolean[] result = new boolean[max+1];
        result[0] = true;
        for (int i : arr) {
            for (int j = max; j >= i; j--) {
                result[j] = result[j-i] || result[j];
            }
        }
        for (int i = min; i < result.length; i++) {
            if (!result[i]) {
                return i;
            }
        }
        return max+1;
	}
}