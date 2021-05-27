// write your code here
import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            String[] strs = new String[n];

           //注意sc.nextInt()还在第一行，没有切换到下一行
            sc.nextLine();
            for (int i = 0; i < n; i++) {
                strs[i] = sc.nextLine();
                if (strs[i].contains(",") || strs[i].contains(" ")) {
                    //代表要在这个名字两边加上""
                    StringBuilder builder = new StringBuilder();
                    builder.append("\"");
                    builder.append(strs[i]);
                    builder.append("\"");
                    strs[i] = builder.toString();
                }
            }

            StringBuilder builder = new StringBuilder();
            for (int i = 0; i < n; i++) {
                builder.append(strs[i]);
                if (i != strs.length-1) {
                    builder.append(", ");
                }
            }
            System.out.println(builder.toString());
        }
    }
}