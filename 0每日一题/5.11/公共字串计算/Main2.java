import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String s1 = sc.nextLine();
            String s2 = sc.nextLine();
            String min = s1.length() > s2.length() ? s2 : s1;
            String max = s1.length() > s2.length() ? s1 : s2;
            int len = 0;
            for (int i = 0; i < min.length(); i++) {
                for (int j = i+1; j <= min.length(); j++) {
                    if (max.contains(min.substring(i,j))) {
                        len = len > (j-i) ? len : (j-i);
                    }
                }
            }
            System.out.println(len);
        }
    }
}