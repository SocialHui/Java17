import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            double a = sc.nextDouble();
            double b = sc.nextDouble();
            double c = sc.nextDouble();
            boolean tmp = is(a,b,c) && is(a,c,b) && is(b,c,a);
            if (tmp) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
    
    public static boolean is(double n1, double n2, double n3){
        if (n1 + n2 > n3) {
            return true;
        }
        return false;
    }
}