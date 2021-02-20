
public class TestDemo {

    public static void main(String[] args) {
        String str = "??";
        System.out.println(modifyString(str));
    }

    public static String modifyString(String s) {

        if (s == null || s.isEmpty()) {
            return null;
        }

        if (s.length() == 1) {
            if (s.equals("?")) {
                return new String("a");
            }
        }

        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '?') {
                char ch = 'a';
                if (i == 0) {
                    //第一个是"?"
                    while (s.charAt(i+1) == ch) {
                        ch++;
                    }
                    stringBuffer.append(ch);
                } else if (i == s.length() - 1) {
                    while (s.charAt(s.length()-2) == ch || stringBuffer.charAt(s.length()-2) == ch) {
                        ch++;
                    }
                    stringBuffer.append(ch);
                } else {
                    while (s.charAt(i-1) == ch || s.charAt(i+1) == ch || stringBuffer.charAt(i-1) == ch) {
                        ch++;
                    }
                    stringBuffer.append(ch);
                }
            } else {
                stringBuffer.append(s.charAt(i));
            }
        }
        return new String(stringBuffer);
    }
}

//https://leetcode-cn.com/problems/replace-all-s-to-avoid-consecutive-repeating-characters/submissions/

