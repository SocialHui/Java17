import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        //递归求斐波那契数列的第 N 项
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = fei(n);
        System.out.println(sum);
    }

    public static int fei(int n){
        if (n<=2) {
            return 1;
        }
        int sum = fei (n-1)+ fei(n-2);
        return sum;
    }

}
