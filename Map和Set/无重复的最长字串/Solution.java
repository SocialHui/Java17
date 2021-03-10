import java.util.*;

public class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s == null) {
            return 0;
        }
        char[] ch = s.toCharArray();
        int max = 0;
        for (int i = 0; i < ch.length; i++) {
            Set<Character> set = new HashSet<>();
            set.add(ch[i]);
            int count = 1;

            for (int j = i+1; j < ch.length; j++) {
                if (set.contains(ch[j])) {
                    break;
                } else {
                    set.add(ch[j]);
                    count++;
                }
            }

            if (count > max) {
                max = count;
            }
        }
        return max;
    }
}
