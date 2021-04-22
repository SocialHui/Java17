
public class Solution {
    public int StrToInt(String str) {

        if (str.length() == 0) {
            return 0;
        }
        if (str.length() == 1 && (str.charAt(0) == '+' || str.charAt(0) == '-')) {
            return 0;
        }

        char ch = '+';   //用来表示符号位
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            if (i == 0 && (str.charAt(i) == '+' || str.charAt(i) == '-')) {
                //代表第一位是符号位
                //将符号位记录在ch中
                ch = str.charAt(i);
                builder.append(ch);
                continue;
            }
            if (str.charAt(i) != '+' && str.charAt(i) != '-') {
                if (str.charAt(i) > '9' || str.charAt(i) < '0') {
                    //代表不符合题目要求，直接返回0
                    return 0;
                } else {
                    //代表是数字，将数字拼接在builder上
                    builder.append(str.charAt(i));
                }
            }
        }
        return Integer.parseInt(builder.toString());
    }
}