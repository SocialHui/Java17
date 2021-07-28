import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String str = sc.nextLine();   //预期输入的
            String str1 = sc.nextLine();   //实际输入的
            //先将两个字符串全部都变成大写的，然后将实际的放在set里面，然后遍历预期的，如果set里面没有这个字母，就将他放在输出的坏掉的里面
            str = str.toUpperCase();
            str1 = str1.toUpperCase();
            HashSet<Character> set = new HashSet<>();
            for (int i = 0; i < str1.length(); i++) {
                set.add(str1.charAt(i));
            }

            List<Character> list = new ArrayList<>();
            for (int i = 0; i < str.length(); i++) {
                if (!set.contains(str.charAt(i))) {
                    //代表这个字母坏了，不存在
                    if (!list.contains(str.charAt(i))) {
                        list.add(str.charAt(i));
                    }
                }
            }

            StringBuilder builder = new StringBuilder();
            for (int i = 0; i < list.size(); i++) {
                builder.append(list.get(i));
            }
            System.out.println(builder.toString());
        }
    }
}