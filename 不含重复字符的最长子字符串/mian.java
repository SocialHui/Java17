import java.util.ArrayList;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max = 0;
        for (int i = 0; i < s.length(); i++) {
            ArrayList<Character> list1 = new ArrayList<>();
            for (int j = i; j < s.length(); j++) {
                if (list1.contains(s.charAt(j))) {
                    break;
                } else {
                    list1.add(s.charAt(j));
                }
            }
            if (list1.size() > max) {
                max = list1.size();
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.lengthOfLongestSubstring("abcabcbb");
    }
}