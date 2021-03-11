import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

class Solution {
    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        if (s.length() == 0 && t.length() == 0) {
            return true;
        }
        Queue<Integer> qu1 = new LinkedList<>();
        Map<Character,Integer> map = new HashMap<>();
        char[] ch = s.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            if (map.containsKey(ch[i])) {
                qu1.add(map.get(ch[i]));
            } else {
                map.put(ch[i],i);
                qu1.add(i);
            }
        }

        Queue<Integer> qu2 = new LinkedList<>();
        Map<Character,Integer> map1 = new HashMap<>();
        char[] ch1 = t.toCharArray();
        for (int i = 0; i < ch1.length; i++) {
            if (map1.containsKey(ch1[i])) {
                qu2.add(map1.get(ch1[i]));
            } else {
                map1.put(ch1[i],i);
                qu2.add(i);
            }
        }
        while (!qu1.isEmpty() && !qu2.isEmpty()) {
            int n1 = qu1.poll();
            int n2 = qu2.poll();
            if (n1 != n2) {
                return false;
            }
        }
        return true;
    }
}
