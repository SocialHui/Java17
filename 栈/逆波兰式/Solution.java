import java.util.Stack;

public class Solution {
    public int evalRPN(String[] tokens) {
        if (tokens.length == 0) {
            return -1;
        }
        if (tokens.length == 1) {
            return Integer.valueOf(tokens[0]);
        }
        int num = 0;
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < tokens.length; i++) {
            String str = tokens[i];
            if (!str.equals("+") && !str.equals("-") && !str.equals("*") && !str.equals("/")) {
                stack.push(Integer.valueOf(str));
            } else {
                int str1 = stack.pop();
                int str2 = stack.pop();
                switch (str) {
                    case "+": {
                        num = str2 + str1;
                        break;
                    }
                    case "-":{
                        num = str2-str1;
                        break;
                    }
                    case "*": {
                        num = str2*str1;
                        break;
                    }
                    case "/": {
                        num = str2/str1;
                        break;
                    }
                }
                stack.push(num);
            }
        }
        return num;
    }
}
