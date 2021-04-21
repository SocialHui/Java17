//需要注意当接收的数字如果是整形，阶乘就可能会超过整形的最大范围
//下面这种方法是错误的
/*import java.util.Scanner;
public class Solution{
    public static void main(String[] args){
        Scanner sc = new  Scanner(System.in);
        while(sc.hasNext()) {
            int n = sc.nextInt();
            int num = 0;
            for (int i = n; i >= 5 ; i--) {
                int tmp = i;
                while (tmp%5 == 0) {
                    num ++;
                    tmp /= 5;
                }
            }
            System.out.println(num);
        }
    }
}*/



//通过率是80%
/*
import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n  = sc.nextInt();
            System.out.println(n/5+n/25+n/125);
        }
    }
}*/


import java.util.*;

public class Solution{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            int num = 0;
            while (n >= 5) {
                int tmp = n;
                while (tmp % 5 == 0) {
                    num++;
                    tmp/=5;
                }
                n--;
            }
            System.out.println(num);
        }
    }
}
