import java.util.*;

public class Solution{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int num = sc.nextInt();
            int num1 = num/2;  //存放最后要输出的数字
            int num2 = num-num1;
            while (true) {
                if (isS(num1) && isS(num2)) {
                    //如果成立，代表是素数，直接跳出循环打印即可
                    break;
                } else {
                    //如果其中有一个数字不是素数，则不符合要求，继续找
                    num1--;
                    num2++;
                }
            }
            System.out.println(num1);
            System.out.println(num2);
        }
    }

    //判断某个数是不是素数
    public static boolean isS(int numN) {
        for (int i = 2; i < numN/2; i++) {
            if (numN%i == 0) {
                //代表不是素数
                return false;
            }
        }
        return true;
    }
}