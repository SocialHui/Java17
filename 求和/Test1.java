public class Test {
    public static void main(String[] args) {
        //递归求 1 + 2 + 3 + ... + 10
        int n = 10;
        int sum = Add(n);
        System.out.println(sum);
    }

    public static int Add(int n) {
        if (n == 1) {
            return 1;
        }
        int sum =n + Add(n-1);
        return sum;
    }

}
