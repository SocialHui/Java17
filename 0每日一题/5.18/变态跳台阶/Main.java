public class Solution {
    public int jumpFloorII(int target) {
        if (target == 0) {
            return 0;
        }
        if (target == 1) {
            return 1;
        }
        
        int num = 1;
        int n = 0;
        while (target-- != 1) {
            num += Math.pow(2,n++);
        }
        return num;
    }
}