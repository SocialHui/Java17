import java.util.Stack;

public class TestDemo {

    class Solution {
        public int evalRPN(String[] tokens) {
            if (tokens.length == 0) {
                return -1;
            }
            Stack<Integer> stack = new Stack<>();

            for (int i = 0; i < tokens.length; i++) {
                if (!tokens[i].equals("+") && !tokens[i].equals("-") && !tokens[i].equals("*") && !tokens[i].equals("/")) {
                    stack.push(Integer.parseInt(tokens[i]));
                } else {
                    int n1 = stack.pop();
                    int n2 = stack.pop();
                    String n = tokens[i];
                    if (n.equals("+")) {
                        stack.push(n2 + n1);
                    }
                    if (n.equals("-")) {
                        stack.push(n2 - n1);
                    }
                    if (n.equals("*")) {
                        stack.push(n2 * n1);
                    }
                    if (n.equals("/")) {
                        stack.push(n2 / n1);
                    }
                }

            }
            return stack.pop();
        }
    }
    
}




