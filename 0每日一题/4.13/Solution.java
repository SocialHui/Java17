import java.util.Scanner;
import java.util.Stack;
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char[] ch = str.toCharArray();
        int left = 0;
        int right = ch.length - 1;
        while (left <= right) {
            char tmp = ch[left];
            ch[left] = ch[right];
            ch[right] = tmp;
            left++;
            right--;
        }
        StringBuilder builder = new StringBuilder();
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] != ' ') {
                stack.push(ch[i]);
            } else {
                while (!stack.isEmpty()) {
                    builder.append(stack.pop());
                }
                builder.append(" ");
            }
        }
        while (!stack.isEmpty()) {
            builder.append(stack.pop());
        }
        System.out.println(builder.toString());
    }
}