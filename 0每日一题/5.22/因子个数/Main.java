// write your code here
import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            HashSet<Integer> set = new HashSet<>();
            int i = 2;
            while (n >= i) {
                if (n%i == 0) {
                    set.add(i);
                    n /= i;
                } else {
                    i++;
                }
            }
            System.out.println(set.size());
        }
    }
}