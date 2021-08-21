import java.util.ArrayList;
public class Solution {
    public ArrayList<ArrayList<Integer> > FindContinuousSequence(int sum) {
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        int left = 1;
        int right = left + 1;
        while (left < sum && right < sum) {
            int sum1 = (left + right) * (right - left + 1) / 2;
            if (sum1 < sum) {
                right++;
            } else if (sum1 > sum) {
                left++;
            } else {
                ArrayList<Integer> list1 = new ArrayList<>();
                for (int j = left; j <= right; j++) {
                    list1.add(j);
                }
                list.add(list1);
                left++;
                right++;
            }

        }
        return list;
    }
}