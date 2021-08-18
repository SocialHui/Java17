import java.util.*;


public class Solution {
    /**
     * 验证IP地址
     * @param IP string字符串 一个IP地址字符串
     * @return string字符串
     */
    public String solve (String IP) {
        // write code here
        if (IP.contains(".")) {
            //IPv4的判断
            String[] ips = IP.split("\\.");
            if (ips.length != 4) {
                return "Neither";
            }
            for (int i = 0; i < ips.length; i++) {
                int num = Integer.parseInt(ips[i]);
                if (num > 0 && num <= 255) {
                    //还要判断这个数字是不是第一个开头的数字是0
                    char ch = ips[i].charAt(0);
                    if (ch == '0') {
                        return "Neither";
                    }
                } else if (num == 0) {
                    //需要判断是不是几个连续的0
                    if (ips[i].length() > 0) {
                        return "Neither";
                    }
                } else {
                    return "Neither";
                }
            }
            return "IPv4";
        } else if (IP.contains(":")) {
            //IPv6的判断
            String[] ips = IP.split("\\:");
            for (int i = 0; i < ips.length; i++) {
                if (ips.length != 8) {
                    return "Neither";
                }
                if (ips[i].length() == 0 || ips[i].length() > 4) {
                    return "Neither";
                } else {
                    for (int j = 0; j < ips[i].length(); j++) {
                        char ch = ips[i].charAt(j);
                        if (!Character.isLowerCase(ch) && !Character.isUpperCase(ch) && !Character.isDigit(ch)) {
                            return "Neither";
                        }
                    }
                }
            }
            return "IPv6";
        } else {
            return "Neither";
        }
    }
}