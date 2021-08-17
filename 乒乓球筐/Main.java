package thread.thread0810;

// write your code here
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String str = sc.nextLine();
            String[] strs = str.split(" ");
            String A = strs[0];
            String B = strs[1];
            HashMap<Character, Integer> mapA = new HashMap<>();
            HashMap<Character, Integer> mapB = new HashMap<>();
            for (int i = 0; i < A.length(); i++) {
                char ch = A.charAt(i);
                if (mapA.containsKey(ch)) {
                    mapA.put(ch, mapA.get(ch) + 1);
                } else {
                    mapA.put(ch, 1);
                }
            }
            for (int i = 0; i < B.length(); i++) {
                char ch = B.charAt(i);
                if (mapB.containsKey(ch)) {
                    mapB.put(ch, mapB.get(ch) + 1);
                } else {
                    mapB.put(ch, 1);
                }
            }

            String s = "Yes";
            for (Map.Entry<Character, Integer> entry : mapB.entrySet()) {
                if (!mapA.containsKey(entry.getKey()) || mapA.get(entry.getKey()) < entry.getValue()) {
                    s = "No";
                    break;
                }
            }
            System.out.println(s);
        }
    }
}