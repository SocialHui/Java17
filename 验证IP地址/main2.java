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
                if (ips[i].startsWith("0") && ips[i].length() >1) {
                    return "Neither";
                }
                try {
                    int num = Integer.parseInt(ips[i]);
                    if (num > 255 || num < 0) {
                        return "Neither";
                    }
                } catch (Exception e){
                    return "Neither";
                }
            }
            return "IPv4";
        } else if (IP.contains(":")) {
            //IPv6的判断
            String[] ips = IP.split(":");
            for (int i = 0; i < ips.length; i++) {
                //注意：题目说了除了认为的给定的字符串里面没有空格或者其他的特殊字符
                if (ips[i].length() > 4) {
                    return "Neither";
                }
            }
            return "IPv6";
        } else {
            return "Neither";
        }
    }