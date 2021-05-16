// write your code here
import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String str = sc.nextLine();
            while (true) {
                int num = jia(str);
                if (num < 10) {
                    System.out.println(num);
                    break;
                }
                str = num+"";
            }
        }
    }
    
    public static int jia(String s) {
        int sum = 0;
        for (int i = s.length()-1; i >= 0; i--) {
            sum += Integer.parseInt(s.charAt(i)+"");
        }
        return sum;
    }
}