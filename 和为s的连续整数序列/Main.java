import java.util.ArrayList;
public class Solution {
    public ArrayList<ArrayList<Integer> > FindContinuousSequence(int sum) {
       ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        int left = 1;
        int right = 2;
        while (left < right) {
            int num = ((left+right)*(right-left+1)/2);
            if (num == sum) {
                ArrayList<Integer> list1 = new ArrayList<>();
                for (int i = left; i <= right; i++) {
                    list1.add(i);
                }
                list.add(list1);
                left++;
            } else if (num < sum) {
                right++;
            } else {
                left++;
            }
        }
        return list;
    }
}