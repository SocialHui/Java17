// write your code here
import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String str = sc.nextLine();
            String[] strs = str.split(" ");
            String s1 = strs[0];
            String s2 = strs[1];
            int count = 0;
            int i = 0;
            int len = s2.length();
            while (i < s1.length()-len+1) {
                if (s1.substring(i,i+len).equals(s2)) {
                    //代表可以剪一个相同的
                    count++;
                    i+=len;
                } else {
                    i++;
                }
            }
            System.out.println(count);
        }
    }
}