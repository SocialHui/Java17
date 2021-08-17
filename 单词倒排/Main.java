package thread.thread0810;

import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String str = sc.nextLine();
            StringBuilder builder = new StringBuilder();
            int i = str.length()-1;
            while (i >= 0){
                char ch = str.charAt(i);
                if (Character.isLowerCase(ch) || Character.isUpperCase(ch)) {
                    builder.append(ch);
                    i--;
                } else {
                    //代表不是字母，然后要循环判断
                    builder.append(" ");
                    while (i >= 0 && !(Character.isUpperCase(str.charAt(i))
                            || Character.isLowerCase(str.charAt(i)))) {
                        i--;
                    }
                }
            }
            String[] strs = builder.toString().split(" ");
            builder = new StringBuilder();
            for (i = 0; i < strs.length; i++) {
                int j = strs[i].length()-1;
                while (j >= 0) {
                    builder.append(strs[i].charAt(j--));
                }
                if (i != strs.length-1) {
                    builder.append(" ");
                }
            }
            System.out.println(builder.toString());
        }
    }
}