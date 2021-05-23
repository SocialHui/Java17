// write your code here
import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String s = sc.nextLine();
            int sum = 0;
            while (true) {
                for (int i = s.length() - 1; i >= 0; i--) {
                    sum += Integer.parseInt(s.charAt(i) + "");
                }
                if (sum < 10) {
                    System.out.println(sum);
                    break;
                } else {
                    s = sum+"";
                    sum = 0;
                }
            }
        }
    }
}