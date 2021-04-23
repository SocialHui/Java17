import java.util.*;
public class Solution{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int num = sc.nextInt();
            /**
             * 用位运算计算
             * 将数字和1按位与，如果这个数字的最低位是1，则按位与的结果是1
             * 如果最低位不是1，则按位与的结果是0
             *  比较玩最低位以后需要进行无符号右移，即>>>
             */
            int maxN = 0;
            int n = 0;
            while (num != 0) {
                if ((num&1) == 1){
                    //代表是1
                    while (num != 0 && (num&1) == 1) {
                        n++;
                        num >>>= 1;   //无符号右移
                    }
                } else {
                    n = 0;
                    num >>>= 1;
                }
                if (n > maxN) {
                    maxN = n;
                }
            }
            System.out.println(maxN);
        }
    }
}