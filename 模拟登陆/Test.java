import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        //模拟登陆
        //编写代码模拟三次密码输入的场景。
        //最多能输入三次密码，密码正确，提示“登录成功”,密码错误，可以重新输入，最多输入三次。三次均错，则提示退出程序
        Scanner sc = new Scanner(System.in);
        int count = 3;
        while (count != 0) {
            String passWord = sc.nextLine();
            if (passWord.equals("123456")) {
                System.out.println("登陆成功！");
                break;
            } else {
                System.out.println("密码错误！");
                count--;
            }
        }
        if(count == 0){
            System.out.println("退出程序！");
        }
    }
}
