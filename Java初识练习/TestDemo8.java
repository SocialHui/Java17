import java.util.Scanner;

public class TestDemo {
    public static void main(String[] args) {
        //求一个整数，在内存当中存储时，二进制1的个数。
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int count = 0;
        while (num != 0) {
            if ((num & 1) == 1){
                count++;
            }
            num >>>= 1;
        }
        System.out.println(count);
    }
}

