import java.util.Stack;

//错误的想法，错误的代码
//错误原因：没读懂题目
//public class Solution {
//    public boolean backspaceCompare(String S, String T) {
//
//        if (S.length() == 0 && T.length() == 0) {
//            return true;
//        }
//
//        Stack<Character> stack = new Stack<>();
//        for (int i = 0; i < S.length() && i < T.length(); i++) {
//            if (S.charAt(i) == T.charAt(i)) {
//                stack.push(S.charAt(i));
//            }
//        }
//
//        return !stack.isEmpty();
//    }
//}


//正确的代码
class Solution {
    public boolean backspaceCompare(String S, String T) {
        if (S.length() == 0 && T.length() == 0) {
            return true;
        }

        StringBuffer s1 = new StringBuffer();
        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) != '#') {
                s1.append(S.charAt(i));
            } else {
                if (s1.length() > 0) {
                    s1.deleteCharAt(s1.length()-1);
                }
            }
        }

        StringBuffer t1 = new StringBuffer();
        for (int i = 0; i < T.length(); i++) {
            if (T.charAt(i) != '#') {
                t1.append(T.charAt(i));
            } else {
                if (t1.length() > 0) {
                    t1.deleteCharAt(t1.length()-1);
                }
            }
        }

        String s = s1.toString();
        String t = t1.toString();
        return s.equals(t);
    }
}

