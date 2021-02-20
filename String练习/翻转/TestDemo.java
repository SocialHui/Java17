import java.util.Scanner;

public class TestDemo {

    public static String reserve(String str, int left, int right) {
        char[] ch = str.toCharArray();
        while (left < right) {
            char tmp = ch[left];
            ch[left] = ch[right];
            ch[right] = tmp;
            left++;
            right--;
        }
        //return new String(ch);
        return String.valueOf(ch);
    }

    public static String func(String str, int k) {
        if (str == null || k <= 0 || k > str.length()) {
            return null;
        }
        str = reserve(str, 0, k - 1);
        str = reserve(str, k, str.length() - 1);
        str = reserve(str, 0, str.length() - 1);
        return str;
        //return reserve(reserve(reserve(str,0,k-1),k,str.length()-1),0,str.length()-1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        String str = scanner.next();
        String ret = func(str, k);
        System.out.println(ret);
    }

}
