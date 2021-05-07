import java.util.*;
import java.math.BigInteger;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String addend = sc.nextLine();
            String augend = sc.nextLine();
            BigInteger s1 = new BigInteger(addend);
            BigInteger s2 = new BigInteger(augend);
            System.out.println(s1.add(s2));
        }
    }
}