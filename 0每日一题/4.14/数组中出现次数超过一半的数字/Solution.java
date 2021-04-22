import java.util.*;
public class Solution {
    public int MoreThanHalfNum_Solution(int [] array) {
        int n = 0;
        Arrays.sort(array);
        int left = 0;
        int len = array.length/2;
        //如果数组的长度只是1，则直接返回这个数组的值
        if (array.length == 1) {
            return array[0];
        }
        while (left < len) {
            if (array[left] == array[left+len]){
                //代表是超过一半的数字
                return array[left];
            }
            left++;
        }
        return 0;
    }
}
