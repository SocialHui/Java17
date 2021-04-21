import java.util.*;

public class Solution{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            String str = n+"";
            StringBuilder builder = new StringBuilder();
            for (int i = str.length()-1; i >= 0; i--) {
                builder.append(str.charAt(i));
            }
            System.out.println(builder.toString());
        }
    }
}