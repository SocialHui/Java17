
public class TestDemo {
    public static void main(String[] args) {
        //递归求 1 + 2 + 3 + ... + 10
        int n = 5;
        System.out.println(sum(n));
    }

    public static int sum(int n) {
        if (n == 1) {
            return 1;
        }
        return n+sum(n-1);
    }

}



