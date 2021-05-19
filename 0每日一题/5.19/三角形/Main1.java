import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            //构成三角形的条件是：任意两边之和大于第三边或者所有的边满足任意两边只差小于第三边
            boolean m = y(a,b,c) && y(a,c,b) && y(b,c,a);
            if (m) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }

    public static boolean y(int x, int y, int z) {
        if (x+y>z) {
            return true;
        }
        return false;
    }
}