import java.util.HashSet;
import java.util.Scanner;

public class TestDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        StringBuilder str = new StringBuilder();
        HashSet<Character> set = new HashSet<>();
        for (int i = 0; i < s2.length(); i++) {
            set.add(s2.charAt(i));
        }
        for (int i = 0; i < s1.length(); i++) {
            if (!set.contains(s1.charAt(i))) {
                //代表字符串2里面不包含这个字符
                str.append(s1.charAt(i));
            }
        }
        System.out.println(str.toString());
    }
}

