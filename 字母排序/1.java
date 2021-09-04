import java.util.*;
/*编程题 数字+字符+字母
        挑出字母 从小到大排序，得到第三个字母 （这里调用了java中的排序函数）*/
//建大堆
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String str = sc.nextLine();
            StringBuilder builder = new StringBuilder();
            for (int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);
                if (Character.isLetter(ch)) {
                    builder.append(ch);
                }
            }
            char[] chars = builder.toString().toCharArray();
            Arrays.sort(chars);
            System.out.println(chars[2]);
        }
    }
}