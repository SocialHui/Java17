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
                if (ch == ' ') {
                    builder.append(ch);
                } else {
                    if (ch <= 'E') {
                        builder.append((char)(ch+21));
                    } else {
                        builder.append((char)(ch-5));
                    }
                }
            }
            System.out.println(builder.toString());
        }
    }
}