public class Solution {
    public int StrToInt(String str) {
        //用来记录数字是正还是负
        int n = 1;
        int num = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (i == 0) {
                if (ch == '-') {
                    n = -1;
                } else if (ch == '+') {
                    n = 1;
                } else if (ch > '9' || ch < '0') {
                    //代表数字不符合要求
                    return 0;
                } else {
                    num = num*10 + Integer.parseInt(ch+"");
                }
            } else {
                //第二个开始
                if (ch > '9' || ch < '0') {
                    return 0;
                } else {
                    int sum = num*10 + Integer.parseInt(ch+"");
                    if ((sum-Integer.parseInt(ch+""))/10 == num) {
                        num = sum;
                    } else {
                        return 0;
                    }
                }
            }
        }

        if (n > 0) {
            return num;
        } else {
            return -num;
        }
    }
}