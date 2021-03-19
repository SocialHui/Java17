class Solution {
    public int compareVersion(String version1, String version2) {
        String[] str = version1.split("\\.");
        String[] str2 = version2.split("\\.");
        int i = 0;
        for (; i < str.length && i < str2.length; i++) {
            int num1 = Integer.valueOf(str[i]);
            int num2 = Integer.valueOf(str2[i]);
            if (num1 < num2) {
                return -1;
            } else if (num1 > num2) {
                return 1;
            }
        }
        for (; i < str.length; i++) {
            if (Integer.valueOf(str[i]) != 0) {
                return 1;
            }
        }
        for (; i < str2.length; i++) {
            if (Integer.valueOf(str2[i]) != 0) {
                return -1;
            }
        }
        return 0;
    }
}
