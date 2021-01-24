import java.util.Scanner;
import java.util.Stack;

public class TestDemo2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        boolean boo = new Solution().isValid(str);
        System.out.println(boo);
    }
}

class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '(' || ch == '[' || ch == '{'){
                stack.push(ch);
            }else {
                if (stack.empty()){
                    System.out.println("右括号比左括号多");
                    return false;
                }
                char ch1 = stack.peek();
                if (ch1 == '(' && ch == ')' || ch1 == '[' && ch == ']' || ch1 == '{' && ch == '}'){
                    stack.pop();
                }else {
                    System.out.println("左右括号不匹配");
                    return false;
                }
            }
        }
        if (stack.empty()){
            return true;
        }
        System.out.println("左括号比右括号多");
        return false;
    }
}

/*
class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for(int i = 0;i < s.length();i++) {
            char ch = s.charAt(i);
            if(ch == '(' || ch == '[' || ch == '{') {
                //说明当前遍历到的字符是左括号
                stack.push(ch);
            }else {
                //1、判断当前的栈是否是空的
                if(stack.empty()) {
                    System.out.println("右括号多");
                    return false;//代表右括号多
                }
                //2、拿到栈顶元素，看栈顶元素是否和当前的字符匹配，如果匹配当前栈顶元素出栈
                char topch = stack.peek();
                if(topch == '{' && ch == '}' || topch == '[' && ch == ']' || topch == '(' && ch == ')') {
                    stack.pop();
                }else{
                    System.out.println("左右括号不匹配");
                    return false;//代表左右括号不匹配
                }
            }
        }
        if(!stack.empty()) {
            System.out.println("左括号多");
            return false;//代表左括号多
        }
        return true;
    }
}*/
