import java.util.Random;
import java.util.Scanner;

public class TestDemo {
    public static void main(String[] args) {
        //猜数字游戏
        Random random = new Random();
        int toGuess = random.nextInt(100);
        Scanner sc = new Scanner(System.in);
        while (true) {
            int num = sc.nextInt();
            if (num == toGuess) {
                System.out.println("猜对了");
                break;
            } else if (num > toGuess) {
                System.out.println("猜大了");
            } else {
                System.out.println("猜小了");
            }
        }
    }
}
