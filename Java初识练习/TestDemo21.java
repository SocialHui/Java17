
public class TestDemo {
    public static void main(String[] args) {
        //递归求斐波那契数列的第 N 项
        int n = 10;
        System.out.println(fib(n));
    }

    public static int fib (int n) {
        if (n == 1 || n == 2) {
            return 1;
        }
        return fib(n-1) + fib(n-2);
    }

}



