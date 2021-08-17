public class Solution {
    public String LeftRotateString(String str,int n) {
        if (str.length() == 0) {
            return "";
        }
        StringBuilder builder = new StringBuilder();
        while (n != 0) {
            String s = str.substring(1,str.length());
            String s1 = str.substring(0,1);
            builder.append(s);
            builder.append(s1);
            str = builder.toString();
            builder = new StringBuilder();
            n--;
        }
        return str;
    }
}