public class Solution {
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     * 计算数列前20项的和
     * @param n int整型 前n项
     * @return double浮点型
     */
    public double testSum (int n) {
        // write code here
        double sum = 0;
        long n1 = 2;
        long n2 = 1;
        while (n != 0) {
            double num = (n1*1.0)/n2;
            sum += num;
            long n3 = n1+n2;
            n2 = n1;
            n1 = n3;
            n--;
        }
        return sum;
    }
}
