import java.util.*;

public class Solution{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        while (sc.hasNext()) {
            String str = sc.nextLine();
            StringBuilder builder = new StringBuilder();
            for (int i = str.length()-1 ; i >= 0; i--) {
                builder.append(str.charAt(i));
            }
            str = builder.toString();
            String[] strs = str.split(" ");
            builder = new StringBuilder();
            for (int i = 0; i <strs.length; i++) {
                str = strs[i];
                for (int j = str.length()-1; j >= 0; j--) {
                    builder.append(str.charAt(j));
                }
                if (i != strs.length-1) {
                    builder.append(" ");
                }
            }
            System.out.println(builder.toString());
        }
    }
}


