import com.sun.javaws.progress.PreloaderPostEventListener;

public class TestDemo {

    public static void main(String[] args) {
        String str = "abababa";
        System.out.println(repeatedSubstringPattern(str));
    }

    public static boolean repeatedSubstringPattern(String s) {
        if (s == null || s.length() == 0) {
            return false;
        }
        if (s.length() == 1) {
            return false;
        }
        int i = 0;
        for (int j = i+1; j < s.length(); j++) {
            if (s.charAt(i) == s.charAt(j)) {
                String str = s.substring(i,j);
                int n = j-i;
                if (s.length() % n != 0) {
                    return false;
                }
                int k = j;
                while (k < s.length()) {
                    String str2 = s.substring(k,k+n);
                    if (!str.equals(str2)) {
                        return false;
                    }
                    k = k+n;
                }
                if (k >= s.length()) {
                    return true;
                }
            }
        }
        return true;
    }
}

//https://leetcode-cn.com/problems/repeated-substring-pattern/

