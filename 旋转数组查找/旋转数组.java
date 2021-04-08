import java.util.ArrayList;
public class Solution {
    public int minNumberInRotateArray(int [] array) {
        if (array.length == 0) {
            return 0;
        }
        int left = 0;
        int right = array.length-1;
        int mid = -1;
        while (array[left] >= array[right]) {
            if (right - left == 1) {
                mid = right;
                break;
            }
            mid = (left + right)/2;
            if (array[mid] >= array[left]) {
                left = mid;
            }
            if (array[mid] <= array[right]) {
                right = mid;
            }
        }
        return array[mid];
    }
}