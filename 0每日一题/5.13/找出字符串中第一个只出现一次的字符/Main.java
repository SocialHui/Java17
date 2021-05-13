import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String str = sc.nextLine();
            boolean flag = true;  //用来判断最后有没有输出

            HashMap<Character, Integer> map = new HashMap<>();
            for (int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);
                if (map.containsKey(ch)) {
                    map.put(ch, map.get(ch) + 1);
                } else {
                    map.put(ch, 1);
                }
            }

            //在遍历一遍看看存不存在只出现一次的
            for (int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);
                if (map.containsKey(ch) && map.get(ch) == 1) {
                    //就代表存在，进行输出
                    System.out.println(ch);
                    flag = false;
                    break;
                }
            }
            
            if (flag) {
                System.out.println(-1);

            }
        }
    }
}