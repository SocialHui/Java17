package thread.thread0810;

import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String str = sc.nextLine();
            StringBuilder builder = new StringBuilder();
            StringBuilder builder1 = new StringBuilder();
            for (int i = 0; i < str.length(); i++) {
                while (i < str.length() && str.charAt(i) >= '0' && str.charAt(i) <= '9') {
                    //说明是数字
                    builder1.append(str.charAt(i++));
                }
                if (builder1.length() > builder.length()) {
                    builder = builder1;
                }
                builder1 = new StringBuilder();
            }

            if (builder1.length() > builder.length()) {
                builder = builder1;
            }
            System.out.println(builder.toString());
        }
    }
}