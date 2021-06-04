// write your code here
import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String str = sc.nextLine();
            StringBuilder builder = new StringBuilder();
            for (int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);
                if (ch >= 'A' && ch <= 'E') {
                    //代表这几个数字回复以后就是最后几个字母
                    builder.append((char)(ch + 21));
                } else if (ch >= 'F' && ch <= 'Z') {
                    //代表恢复以后就是这个字母的前5个
                    builder.append((char)(ch-5));
                } else {
                    builder.append(ch);
                }
            }
            System.out.println(builder.toString());
        }
    }
}