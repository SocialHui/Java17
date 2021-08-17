package thread.thread0810;
import java.util.*;

public class Solution {
    public int MoreThanHalfNum_Solution(int [] array) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            if (map.containsKey(array[i])) {
                map.put(array[i],map.get(array[i])+1);
            } else {
                map.put(array[i],1);
            }
        }
        int len = array.length/2 +1;
        for (Map.Entry<Integer,Integer> entry : map.entrySet()) {
            if (entry.getValue() >= len) {
                return entry.getKey();
            }
        }
        return 0;
    }
}
