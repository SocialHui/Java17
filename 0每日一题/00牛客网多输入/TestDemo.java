import java.util.*;

public class TestDemo{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        Queue<Character> queue = new LinkedList<>();

        StringBuilder builder = new StringBuilder();
        String maxStr = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= '0' && ch <= '9') {
                //代表是一个数字
                queue.offer(ch);
            } else {
                //代表不是数字
                while (!queue.isEmpty()) {
                    builder.append(queue.poll());
                }
                if (builder.length() > maxStr.length()) {
                    maxStr = builder.toString();
                }
                builder = new StringBuilder();
            }
        }
        //若最后面一连串的是数字，则需要在下面判断一下是不是最长的
        while (!queue.isEmpty()) {
            builder.append(queue.poll());
        }
        if (builder.length() > maxStr.length()) {
            maxStr = builder.toString();
        }
        System.out.println(maxStr);
    }
}
