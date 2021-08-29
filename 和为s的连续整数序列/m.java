import java.util.ArrayList;
public class Solution {
    public ArrayList<ArrayList<Integer> > FindContinuousSequence(int sum) {
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        int i = 1;
        int j = i+1;
        while (i < j) {
            int num = (i+j)*(j-i+1)/2;
            if (num < sum) {
                j++;
            } else if (num > sum) {
                i++;
            } else {
                ArrayList<Integer> list1 = new ArrayList<>();
                int k = i;
                while (k <= j) {
                    list1.add(k++);
                }
                list.add(list1);
                i++;
            }
        }
        return list;
    }
}