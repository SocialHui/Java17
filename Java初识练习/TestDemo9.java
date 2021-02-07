import java.util.Scanner;

public class TestDemo {
    public static void main(String[] args) {
        //编写代码模拟三次密码输入的场景。
        // 最多能输入三次密码，密码正确，提示“登录成功”,密码错误， 可以重新输 入，最多输入三次。
        // 三次均错，则提示退出程序
        Scanner scanner = new Scanner(System.in);
        int count = 3;
        System.out.println("请输入密码");
        while (count != 0) {
            String passWord = scanner.nextLine();
            if (passWord.equals("101213")) {
                System.out.println("登录成功");
                break;
            }
            System.out.println("密码错误，请重新输入密码");
            count--;
        }
    }
}

