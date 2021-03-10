import java.util.*;

public class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {

        Set<String> set = new HashSet<>();
        for (int i = 0; i < banned.length; i++) {
            set.add(banned[i]);
        }

        String str = paragraph.toLowerCase();
        str = str.replaceAll(",", " ").replaceAll("\\."," ").
                replaceAll("!"," ").replaceAll("\\?"," ").
                replaceAll(";"," ").replaceAll("'"," ");
        String[] str2 = str.split(" ");

        Map<String,Integer> map = new HashMap<>();

        for (int i = 0; i < str2.length; i++) {
            if (!str2[i].equals("") && !set.contains(str2[i])) {
                if (map.containsKey(str2[i])) {
                    map.put(str2[i], map.get(str2[i])+1);
                } else {
                    map.put(str2[i],1);
                }
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
