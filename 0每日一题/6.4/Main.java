// write your code here
import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            Stack<Integer> stack = new Stack<>();

            int n = sc.nextInt();
            sc.nextLine();
            char[] charA = sc.nextLine().toCharArray();
            char[] chars = new char[n];
            int j = 0;
            for (int i = 0; i < charA.length; i++) {
                if (charA[i] != ' ') {
                    chars[j++] = charA[i];
                }
            }

            for (int i = 0; i < chars.length; i++) {
                char ch = chars[i];
                if (ch != '+' && ch != '-' && ch != '*' && ch != '/') {
                    stack.push(Integer.parseInt(ch+""));
                } else {
                    //代表是运算符
                    if (ch == '+') {
                        stack.push(stack.pop()+stack.pop());
                    } else if (ch == '-') {
                        int n2 = stack.pop();
                        int n1 = stack.pop();
                        stack.push(n1-n2);
                    } else if (ch == '*') {
                        stack.push(stack.pop()*stack.pop());
                    }else {
                        //除法
                        int n2 = stack.pop();
                        int n1 = stack.pop();
                        stack.push(n1/n2);
                    }
                }
            }
            System.out.println(stack.peek());
        }
    }
}