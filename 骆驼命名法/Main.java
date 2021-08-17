package thread.thread0810;

import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String str = sc.nextLine();
            StringBuilder builder = new StringBuilder();
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == '_') {
                    //此时需要将i++，并且将i++之后的这个字母编程大写的拼接在后面
                    i++;
                    char ch = Character.toUpperCase(str.charAt(i));
                    builder.append(ch);
                } else {
                    builder.append(str.charAt(i));
                }
            }
            System.out.println(builder.toString());
        }
    }
}