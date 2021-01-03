import com.sun.xml.internal.stream.Entity;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        //求一个整数，在内存当中存储时，二进制1的个数。
        Scanner sc = new Scanner(System.in);  //键盘输入一个整数
        int num = sc.nextInt();
        int n = 1;
        int sum = 0;
        for (int i=0; i<32; i++){
            if ((num & (n<<i)) != 0){
                sum++;
            }
        }
        System.out.println("整数的二进制中1的个数是：" + sum);
    }
}
