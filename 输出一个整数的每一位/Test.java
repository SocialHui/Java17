import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        //输出一个整数的每一位，如：123的每一位是1 ， 2 ， 3
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        print (num);
    }

    public static void print (int num) {    //方法
        if (num < 10) {
            System.out.println(num);
        }else{
            print(num/10);
            System.out.println(num%10);
        }
    }
}
