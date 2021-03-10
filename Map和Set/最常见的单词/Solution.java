import java.util.*;

public class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {

        String str = paragraph.toLowerCase();
        str = str.replaceAll(",", " ").replaceAll("\\."," ").
                replaceAll("!"," ").replaceAll("\\?"," ").
                replaceAll(";"," ").replaceAll("'"," ");
        String[] str2 = str.split(" ");

        Queue<String> queue = new LinkedList<>();
        for (int i = 0; i < str2.length; i++) {
            if (!str2[i].equals("")) {
                queue.add(str2[i]);
            }
        }

        Set<String> set = new HashSet<>();
        for (int i = 0; i < banned.length; i++) {
            set.add(banned[i]);
        }

        Map<String,Integer> map = new HashMap<>();
        while (!queue.isEmpty()) {
            if (!set.contains(queue.peek())) {
                String s = queue.peek();
                if (map.containsKey(s)) {
                    map.put(s,map.get(s)+1);
                } else {
                    map.put(s,1);
                }
                queue.poll();
            } else {
                queue.poll();
            }
        }

        int max = 0;
        String value = "";
        for (Map.Entry<String,Integer> entry : map.entrySet()) {
            if (entry.getValue() > max) {
                max = entry.getValue();
                value = entry.getKey();
            }
        }
        return value;
    }
}
