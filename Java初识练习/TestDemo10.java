import java.util.Scanner;

public class TestDemo {
    public static void main(String[] args) {
        //输出一个整数的每一位，如：123的每一位是1 ， 2 ， 3
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        print(num);
    }

    public static void print(int num) {
        if (num < 10){
            System.out.println(num);
            return;
        }
        print(num/10);
        System.out.println(num%10);

    }
}

