import java.util.*;
public class Solution{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int num = sc.nextInt();
            //byte类型是1个字节即8个比特
            int n = 0;  //代表连续1的个数
            int maxN = 0;
            while (num != 0) {
                if (num % 2 == 1) {
                    while (num != 0 && num % 2 == 1) {
                        //代表是1
                        n++;
                        num /= 2;
                    }
                } else {
                    num /= 2;
                }
                if (n > maxN) {
                    maxN = n;
                }
                n = 0;
            }
            System.out.println(maxN);
        }
    }
}