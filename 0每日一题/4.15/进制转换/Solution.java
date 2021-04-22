public class Solution {
    /**
     * 进制转换
     * @param M int整型 给定整数
     * @param N int整型 转换到的进制
     * @return string字符串
     */
    public String solve (int M, int N) {
        // write code here
        StringBuilder builder = new StringBuilder();
        int m = M;
        if (m < 0) {
            M = -M;
        }
        
        while (M != 0) {
            int num = M%N;
            if (num >= 10) {
                num = num+55;  //代表字母在ASIIC中的值
                char ch = (char) num;
                builder.append(ch);
            } else {
                builder.append(num);
            }
            M = M/N;
        }
        if (m < 0) {
            builder.append("-");
        }
        return builder.reverse().toString();
    }
}
