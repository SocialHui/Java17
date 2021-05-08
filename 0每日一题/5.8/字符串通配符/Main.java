import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String s1 = sc.nextLine();
            String s2 = sc.nextLine();

            int j = 0;  //s2字符串的下标
            boolean flag = true;
            int i = 0;

            for (; i < s1.length() && j < s2.length(); i++) {
                if (s1.charAt(i) == s2.charAt(j)) {
                    j++;
                } else if (s1.charAt(i) == '*') {
                    while (j < s2.length() && ((s2.charAt(j) >= '0' && s2.charAt(j) <= '9') || (s2.charAt(j) >= 'a' && s2.charAt(j) <= 'z') || (s2.charAt(j) >= 'A' && s2.charAt(j) <= 'Z'))){
                        j++;
                    }
                } else if(s1.charAt(i) == '?') {
                    j++;
                } else {
                    System.out.println(false);
                    flag = false;
                    break;
                }
            }

            if (flag) {
                System.out.println(true);
            }
        }
    }
}