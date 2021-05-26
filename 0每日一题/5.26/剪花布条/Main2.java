// write your code here
import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String s1 = sc.next();
            String s2 = sc.next();
            int count = 0;
            while (true) {
                if (s1.contains(s2)) {
                    s1 = s1.replaceFirst(s2,"");
                    count++;
                } else {
                    break;
                }
            }
            System.out.println(count);
        }
    }
}