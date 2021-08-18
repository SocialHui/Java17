class Solution {
    public String reverseStr(String s, int k) {
        int i = 0;
        StringBuilder builder = new StringBuilder();
        while (i < s.length()) {
            int j = 0;
            StringBuilder builder1 = new StringBuilder();
            while (i < s.length() && j < k) {
                builder1.append(s.charAt(i++));
                j++;
            }
            builder.append(builder1.reverse());
            if (i >= s.length()) {
                break;
            }
            j = 0;
            while (i < s.length() && j < k) {
                builder.append(s.charAt(i++));
                j++;
            }
            if (i >= s.length()) {
                break;
            }
        }
        return builder.toString();
    }
}