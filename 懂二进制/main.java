public class Solution {
    /**
     * 获得两个整形二进制表达位数不同的数量
     * 
     * @param m 整数m
     * @param n 整数n
     * @return 整型
     */
    public int countBitDiff(int m, int n) {
        int num = m^n;
        int k = 0;
        while (num != 0) {
            if ((num & 1) == 1) {
                k++;
            }
            num = num >>> 1;
        }
        return k;
    }
}