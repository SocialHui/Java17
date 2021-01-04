import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        //写一个递归方法，输入一个非负整数，返回组成它的数字之和
        System.out.print("请输入一个非负整数：  ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = Add(n);
        System.out.println(sum);
    }

    public static int Add (int n) {
        if (n < 10) {
            return n;
        }
        return n%10 + Add(n/10);
    }

}
