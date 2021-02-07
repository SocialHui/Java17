import java.util.Scanner;

public class TestDemo {
    public static void main(String[] args) {
        //获取一个数二进制序列中所有的偶数位和奇数位， 分别输出二进制序列
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.print("偶数位二进制序列为：");
        for (int i=32; i>0; i-=2) {
            System.out.print((num>>>i & 1) + " ");//打印偶数位
        }
        System.out.println("\n");
        System.out.print("偶数位二进制序列为：");
        for (int i=31; i>0; i-=2) {
            System.out.print((num>>>i & 1) + " ");//打印奇数位
        }
    }
}

