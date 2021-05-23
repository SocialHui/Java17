import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            double n1 = sc.nextDouble();
            double n2 = sc.nextDouble();
            double l = n2*3.14*2;
            if (n1 > l) {
                System.out.println("No");
            } else {
                System.out.println("Yes");
            }
        }
    }
}
