import java.util.*;

public class Gift {
    public int getValue(int[] gifts, int n) {
        // write code here
        int num = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            if (map.containsKey(gifts[i])) {
                map.put(gifts[i],map.get(gifts[i])+1);
                if (map.get(gifts[i]) > n/2) {
                    num = gifts[i];
                    break;
                }
            } else {
                map.put(gifts[i],1);
            }
        }
        return num;
    }
}