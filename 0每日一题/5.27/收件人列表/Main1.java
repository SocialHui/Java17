import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = Integer.parseInt(sc.nextLine());
            StringBuilder builder = new StringBuilder();
            for (int i = 0; i < n; i++) {
                String str = sc.nextLine();
                if (str.contains(",") || str.contains(" ")) {
                    builder.append("\"");
                    builder.append(str);
                    builder.append("\""+", ");
                } else {
                    builder.append(str+", ");
                }
            }
            System.out.println(builder.toString().substring(0,builder.length()-2));
        }
    }
}