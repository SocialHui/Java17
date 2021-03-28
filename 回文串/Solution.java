public class Solution {
    public boolean isPalindrome(String s) {
        String str = s.toLowerCase();
        int left = 0;
        int right = s.length()-1;
        while (left < right) {
            char ch1 = str.charAt(left);
            char ch2 = str.charAt(right);

            if (Character.isLetterOrDigit(ch1) && Character.isLetterOrDigit(ch2)) {
                if (ch1 != ch2) {
                    return false;
                }
                left++;
                right--;
            }
            if (!Character.isLetterOrDigit(ch1)){
                left++;
            }
            if (Character.isLetterOrDigit(ch2)){
                right--;
            }
        }
        return true;
    }
}

