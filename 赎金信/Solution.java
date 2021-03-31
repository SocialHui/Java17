import java.util.HashMap;
import java.util.Map;

class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character,Integer> map1 = new HashMap<>();
        for (int i = 0; i < ransomNote.length(); i++) {
            char ch = ransomNote.charAt(i);
            if (map1.containsKey(ch)) {
                map1.put(ch,map1.get(ch)+1);
            } else {
                map1.put(ch,1);
            }
        }
        Map<Character,Integer> map2 = new HashMap<>();
        for (int i = 0; i < magazine.length(); i++) {
            char ch = magazine.charAt(i);
            if (map2.containsKey(ch)) {
                map2.put(ch,map2.get(ch)+1);
            } else {
                map2.put(ch,1);
            }
        }
        for (int i = 0; i < ransomNote.length(); i++) {
            char ch = ransomNote.charAt(i);
            if (!map2.containsKey(ch)) {
                return false;
            } else if (map1.get(ch) > map2.get(ch)) {
                return false;
            }
        }
        return true;
    }
}
