import java.util.ArrayList;
import java.util.Stack;

public class CatDogAsylum {
    public ArrayList<Integer> asylum(int[][] ope) {
        // write code here
        ArrayList<Integer> list = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();
        for (int i =0; i < ope.length; i++) {
            if (ope[i][0] == 1) {
                stack.push(ope[i][1]);
            } else {
                if (ope[i][1] == 0) {
                    Stack<Integer> stack1 = new Stack<>();
                    while (!stack.isEmpty()) {
                        stack1.push(stack.pop());
                    }
                    list.add(stack1.pop());
                    while (!stack1.isEmpty()) {
                        stack.push(stack1.pop());
                    }
                } else if (ope[i][1] == 1) {
                    Stack<Integer> stack1 = new Stack<>();
                    while (!stack.isEmpty()) {
                        stack1.push(stack.pop());
                    }
                    int k = 0;
                    while (!stack1.isEmpty()) {
                        if (stack1.peek() > 0 && k == 0) {
                            list.add(stack1.pop());
                            k = 1;
                        }
                        if (!stack1.isEmpty()) {
                            stack.push(stack1.pop());
                        }
                    }
                } else {
                    Stack<Integer> stack1 = new Stack<>();
                    while (!stack.isEmpty()) {
                        stack1.push(stack.pop());
                    }
                    int k = 0;
                    while (!stack1.isEmpty()) {
                        if (stack1.peek() < 0 && k == 0) {
                            list.add(stack1.pop());
                            k = 1;
                        }
                        if (!stack1.isEmpty()) {
                            stack.push(stack1.pop());
                        }

                    }
                }
            }
        }
        return list;
    }
}
