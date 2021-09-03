// write your code here
import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            if (n == 0) {
                return;
            }
            int num = 0;   
            while (n != 1) {
                if(n%3 == 0) {
                    n /= 3;
                } else {
                    //这里代表这个数字不能整除3，所以需要在这个数字里面找出来一个最大的数字，来继续进行计算次数
                    int num1 = (n+1)/3;
                    int num2 = n - num1 - num1;
                    n = Math.max(num1,num2);
                }
                num++;
            }
            System.out.println(num);
        }
    }
}