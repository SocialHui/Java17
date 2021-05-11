import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String str = sc.nextLine();
            StringBuffer s = new StringBuffer();
            for (int i = str.length()-1; i >= 0 ; i--) {
                s.append(str.charAt(i));
            }
            System.out.println(s.toString());
        }
    }
}