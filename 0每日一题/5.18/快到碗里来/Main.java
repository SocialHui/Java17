import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            double n = sc.nextDouble(); //猫的长度
            double r = sc.nextDouble(); // 碗的半径
            double len = 2*r*3.14;
            if (len >= n) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}