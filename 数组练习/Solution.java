import java.util.ArrayList;
import java.util.List;

public class Solution {
    //k代表要找的个数
    //x代表靠近谁
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        if (k > arr.length) return null;
        int[] drr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            drr[i] = Math.abs(x - arr[i]);
        }
        List<Integer> list = new ArrayList<>();
        int i = 0;
        int j = drr.length-1;
        while (j-i+1 > k) {
            if (drr[i] > drr[j]) {
                i++;
            }
            if (drr[i] <= drr[j]) {
                j--;
            }
        }
        while (k > 0) {
            list.add(arr[i]);
            k--;
            i++;
        }
        return list;
    }
}
