import java.util.ArrayList;
import java.util.Stack;

public class IsPopOrder {

        public boolean isPopOrder(int [] pushA,int [] popA) {
            if (pushA.length == 0 && popA.length == 0) {
                return false;
            }
            Stack<Integer> stack = new Stack<>();
            int indexPop = 0;
            for (int i = 0; i < pushA.length; i++) {
                stack.push(pushA[i]);
                while (!stack.empty() && popA[indexPop] == stack.peek()) {
                    indexPop++;
                    stack.pop();
                }
            }
            if (stack.empty()) {
                return true;
            }
            return false;
        }
}
