
public class TestDemo {
    public static void main(String[] args) {
        //递归打印数字的每一位
        int num = 1234;
        print(num);
    }

    public static void print (int num) {
        if (num < 10) {
            System.out.println(num);
        } else {
            print(num/10);
            System.out.println(num%10);
        }
    }
}



