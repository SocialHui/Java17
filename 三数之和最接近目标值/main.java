import java.util.*;


public class Solution {
    /**
     * 
     * @param num int整型一维数组 
     * @param target int整型 
     * @return int整型
     */
    public int threeSumClosest (int[] num, int target) {
        // write code here
        Arrays.sort(num);
        int n = Integer.MAX_VALUE;
        for (int i = 0; i < num.length-2; i++) {
            int left = i+1;
            int right = num.length-1;
            while (left < right) {
                int sum = num[i] + num[left] + num[right];
                if (sum < target) {
                    left++;
                } else if (sum > target){
                    right--;
                } else {
                    n = target;
                    break;
                }
                if (sum < n) {
                    n = sum;
                }
            }
        }
        return n;
    }
}