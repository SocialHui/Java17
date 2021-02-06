
public class TestDemo {
    public static void main(String[] args) {
        //求两个正整数的最大公约数
        //1、辗转相除法
        int a = 5;
        int b = 3;
        int c = 0;
        while (a%b != 0) {
            c = a%b;
            a = b;
            b = c;
        }
        System.out.println("最大公约数是"+c);
        func(a,b);
    }

    //第二种方法
    public static void func(int a, int b) {
        int c = a > b ? b : a;
        for (int i = c; i > 1; i--) {
            if (a%i == 0 && b%i == 0) {
                System.out.println("最大公约数是 " + i);
                break;
            }
        }
    }

}
