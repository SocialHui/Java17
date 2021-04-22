import java.util.*;

public class Solution{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String str = sc.nextLine();
            StringBuilder maxBuilder = new StringBuilder();   //用来存放最大的数字串
            StringBuilder builder = new StringBuilder();  //存放临时的数字串
            for (int i = 0; i < str.length(); i++){
                char ch = str.charAt(i);
                if(ch >= '0' && ch <= '9') {
                    //代表是数字
                    builder.append(ch);
                } else {
                    //不是数字就要判断最大数字串和现在这个数字串的大小
                    if (builder.length() > maxBuilder.length()) {
                        maxBuilder = builder;
                    }
                    builder = new StringBuilder();
                }
            }
            if (builder.length() > maxBuilder.length()) {
                maxBuilder = builder;
            }
            System.out.println(maxBuilder.toString());
        }
    }
}
