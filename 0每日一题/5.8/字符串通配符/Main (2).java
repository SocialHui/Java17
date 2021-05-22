import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String s1 = sc.nextLine();
            String s2 = sc.nextLine();
            System.out.println(match(s1,s2,0,0));
        }
    }
    public static boolean match(String s1, String s2, int c1, int c2) {
        //两个字符串全部匹配完成
        if (c1 == s1.length() && c2 == s2.length()) {
            return true;
        }
        //只有一个匹配结束
        if (c1 == s1.length() || c2 == s2.length()) {
            return false;
        }
        if (s1.charAt(c1) == '?') {
            return match(s1,s2,c1+1,c2+1);
        } else if (s1.charAt(c1) == '*') {
            return match(s1,s2,c1+1,c2) || match(s1,s2,c1+1,c2+1) || match(s1,s2,c1,c2+1);
        } else if (s1.charAt(c1) == s2.charAt(c2)) {
            return match(s1,s2,c1+1,c2+1);
        } else {
            return false;
        }
    }
}