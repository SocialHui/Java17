import java.util.*;


public class Solution {
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     * 
     * @param array1 int整型一维数组 
     * @param n int整型 
     * @param array2 int整型一维数组 
     * @param m int整型 
     * @return int整型一维数组
     */
    public int[] arrayMerge (int[] array1, int n, int[] array2, int m) {
        // write code here
        int[] nums = new int[n+m];
        int i = 0;
        int j = m-1;
        int k = 0;
        while (i < n && j >= 0) {
            if (array1[i] < array2[j]) {
                nums[k++] = array1[i];
                i++;
            } else {
                nums[k++] = array2[j];
                j--;
            }
        }
        
        while (i < n) {
            nums[k++] = array1[i++];
        }
        while (j >= 0) {
            nums[k++] = array2[j--];
        }
        return nums;
    }
}