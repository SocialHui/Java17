
import java.util.*;

public class Solution{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String str = sc.nextLine();  //输入一行数据
            StringBuilder builder = new StringBuilder();
            int len = 0;  //记录参数的个数
            int pan = 0;  //用来记录“的个数
            for (int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);
                if (ch == '\"'){
                    pan++;
                    continue;
                }

                if (ch != ' ') {
                    builder.append(ch);
                } else {
                    if (pan%2 == 0) {
                        //代表一个参数已经结束
                        builder.append("\n");
                        len++;
                    } else {
                        builder.append(" ");
                    }
                }
            }
            System.out.println(len+1);
            System.out.println(builder.toString());
        }
    }
}
