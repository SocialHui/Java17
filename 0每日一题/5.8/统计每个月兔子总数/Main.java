import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int month = sc.nextInt();
            if (month <= 2) {
                System.out.println(1);
            } else {
                int left = 1;
                int right = 1;
                while (month-2 > 0) {
                    int ret = left+right;
                    left = right;
                    right = ret;
                    month--;
                }
                System.out.println(right);
            }
        }
    }
}