import user.AdminUser;
import user.NormalUser;
import user.User;

import java.util.Scanner;

public class TestDemo {
    public static User login() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入你的姓名");
        String name = scanner.nextLine();
        System.out.println("请输入你的身份：  1、管理员  0、普通用户");
        int choice = scanner.nextInt();
        if (choice == 1) {
            return new AdminUser(name);
        } else {
            return new NormalUser(name);
        }
    }

    public static void main(String[] args) {
        //1、登录
        User user = login();
        int choice = user.menu();

    }

}
