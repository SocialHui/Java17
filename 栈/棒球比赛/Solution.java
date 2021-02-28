import java.util.Stack;

class Solution {
    public int calPoints(String[] ops) {
        Stack<Integer> stack = new Stack<>();
        int sum = 0;
        for (int i =0; i < ops.length; i++) {
            if (!ops[i].equals("+") && !ops[i].equals("C") && !ops[i].equals("D")) {
                stack.push(Integer.valueOf(ops[i]));
            } else {
                switch (ops[i]) {
                    case "+": {
                        if (stack.size() < 2) {
                            continue;
                        }
                        int num1 = stack.pop();
                        int num2 = stack.pop();
                        int num = num1 + num2;
                        stack.push(num2);
                        stack.push(num1);
                        stack.push(num);
                        break;
                    }
                    case "C":{
                        stack.pop();
                        break;
                    }
                    case "D":{
                        stack.push(stack.peek() * 2);
                        break;
                    }
                }
            }
        }
        while (!stack.isEmpty()) {
            sum += stack.pop();
        }
        return sum;
    }
}
