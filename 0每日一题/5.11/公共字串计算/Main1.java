import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String s1 = sc.nextLine();
            String s2 = sc.nextLine();
            String str1 = s1.length() > s2.length() ? s2 : s1;
            String str2 = s1.length() <= s2.length() ? s2 : s1;
            int num = 0;  //存放最长子串的长度
            //str1里面存放的是较短的字符串
            for (int i = 0; i < str1.length(); i++) {
                for (int j = i+1; j <= str1.length(); j++) {
                    if (str2.contains(str1.substring(i,j)) && j-i > num) {
                        num = j-i;
                    }
                }
            }
            System.out.println(num);
        }
    }
}