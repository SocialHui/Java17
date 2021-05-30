// write your code here
import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String str = sc.nextLine();
            String[] strs = str.split(" ");
            int count = 0;
            while (strs[0].contains(strs[1])) {
                count++;
                strs[0] = strs[0].replaceFirst(strs[1],"");
            }
            System.out.println(count);
        }
    }
}