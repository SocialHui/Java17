import java.util.*;
public class Solution {
    public boolean IsContinuous(int [] numbers) {
        //先计算0的个数
        int[] nums = new int[numbers.length];
        int j = 0;
        Arrays.sort(numbers);
        int i = 0;
        int num = 0;
        while (i < numbers.length) {
            if (numbers[i] == 0) {
                num++;
                i++;
            } else {
                break;
            }
        }
        if (i < numbers.length) {
            nums[j++] = numbers[i++];
        }
        while (i < numbers.length) {
            if (numbers[i] == nums[j-1]+1) {
                nums[j++] = numbers[i++];
            } else if (num != 0){
                nums[j] = nums[j-1]+1;
                num--;
                j++;
            } else {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {0,3,1,6,4};
        System.out.println(solution.IsContinuous(nums));
    }
}