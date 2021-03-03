import java.util.Scanner;

public class TestDemo {

    public static int target(int num, int a, int b) {
        if (num >= a && num <= b) {
            int bu1 = Math.abs(num - a);
            int bu2 = Math.abs(num - b);
            return Math.min(bu1,bu2);
        }
        return -1;
    }

    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int buShu = target(num,a,b);
        if (buShu != -1) {
            System.out.println(buShu);
            return;
        }
        while (true){
            int cur = a+b;
            a = b;
            b = cur;
            buShu = target(num,a,b);
            if (buShu != -1) {
                System.out.println(buShu);
                break;
            }
        }
    }
}
