import java.util.ArrayList;
public class Solution {
    public ArrayList<Integer> FindNumbersWithSum(int [] array,int sum) {
        //和相等，两个数相差越大，乘积越小
        ArrayList<Integer> list = new ArrayList<>();
        if (array == null || array.length == 0) {
            return list;
        }
        int left = 0;
        int right = array.length-1;
        while (left < right) {
            int cur = array[left]+array[right];
            if (cur < sum) {
                left++;
            } else if (cur > sum) {
                right--;
            } else {
                list.add(array[left]);
                list.add(array[right]);
                break;
            }
        }
        return list;
    }
}