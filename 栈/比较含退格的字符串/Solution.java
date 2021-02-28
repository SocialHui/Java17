import java.util.Stack;

class Solution {
    public Stack<Character> ru (String str) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            if (stack.size() != 0 && str.charAt(i) == '#') {
                stack.pop();
            } else {
                if (str.charAt(i) == '#') {
                    continue;
                }
                stack.push(str.charAt(i));
            }
        }
        return stack;
    }

    public boolean backspaceCompare(String S, String T) {
        Stack<Character> stack1 = ru(S);
        Stack<Character> stack2 = ru(T);
        while (stack1.size() != 0 && stack2.size() != 0) {
            if (stack1.pop() != stack2.pop()) {
                return false;
            }
        }
        if (stack1.size() != 0 || stack2.size() != 0) {
            return false;
        }
        return true;
    }
}
