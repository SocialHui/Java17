public class Solution {
    public int NumberOf1(int n) {
        int num = 0;
        while (n != 0) {
            if ((n & 1) == 1) {
                num++;
            }
            n = n >>> 1;   //无符号右移
        }
        return num;
    }
}