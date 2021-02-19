package user;

import java.util.Scanner;

//管理员
public class AdminUser extends User {

    @Override
    public int menu() {
        System.out.println("管理员的菜单");
        System.out.println("===================");
        System.out.println("hello " + this.name + " 欢迎来到图书系统！");
        System.out.println("1.查找图书");
        System.out.println("2.新增图书");
        System.out.println("3.删除图书");
        System.out.println("4.显示图书");
        System.out.println("0.退出图书");
        System.out.println("===================");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        return choice;
    }

    public AdminUser(String name) {
        super(name);
    }
}
