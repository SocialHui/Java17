public class Solution {

    //以下这种写法总是会报NumberFormatException 异常
    /*public int[] plusOne(int[] digits) {
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < digits.length; i++) {
            ans.append(digits[i]);
        }
        String str = ans.toString();
        double num = Integer.parseInt(str);
        num = num+1;
        str = num + "";
        int[] tmp = new int[str.length()];
        for (int i = 0; i < tmp.length; i++) {
            tmp[i] = str.charAt(i)-48;
        }
        return tmp;
    }*/
    public int[] plusOne(int[] digits) {
        for (int i = digits.length-1; i >= 0 ; i--) {
            if (digits[i] == 9) {
                digits[i] = 0;
            } else {
                digits[i] = digits[i]+1;
                return digits;
            }
        }
        int[] tmp = new int[digits.length+1];
        tmp[0] = 1;
        return tmp;
    }
}
