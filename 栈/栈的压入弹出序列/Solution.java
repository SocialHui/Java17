import java.util.ArrayList;
import java.util.Stack;

public class Solution {
    public boolean IsPopOrder(int [] pushA,int [] popA) {
        Stack<Integer> stack = new Stack<>();
        int j = 0;
        for (int i = 0; i < pushA.length; i++) {
            if (pushA[i] != popA[j]) {
                stack.push(pushA[i]);
            } else {
                j++;
                while (stack.size() != 0 && stack.peek() == popA[j]) {
                    stack.pop();
                    j++;
                }
            }
        }
        if (stack.empty()){
            return true;
        }
        return false;
    }
}
