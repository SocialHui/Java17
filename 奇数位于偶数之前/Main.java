import java.util.*;


public class Solution {
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     * 
     * @param array int整型一维数组 
     * @return int整型一维数组
     */
    public int[] reOrderArray (int[] array) {
        // write code here
        int[] nums = new int[array.length];
        int j = 0;
        int k = array.length-1;
        int left = 0;
        int right = array.length-1;
        while (left < array.length && right >= 0) {
            if (array[left]%2 != 0) {
                nums[j++] = array[left];
            }
            if (array[right]%2 == 0) {
                nums[k--] = array[right];
            }
            left++;
            right--;
        }
        return nums;
    }
}