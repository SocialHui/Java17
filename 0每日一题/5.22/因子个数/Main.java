// write your code here
import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            //题目要求找到质因数的个数
            int num = 0;
            List<Integer> list = new LinkedList<>();
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    //代表i是num的因数
                    //去判断i是不是质因数
                    boolean tmp = isZhi(i);
                    if (tmp) {
                        list.add(i);
                    }
                }
            }
            HashSet<Integer> set = new HashSet<>();
            for (int i = 0; i < list.size(); i++) {
                set.add(list.get(i));
            }
            System.out.println(set.size());
        }
    }

    private static boolean isZhi(int i) {
        for (int j = 2; j < i; j++) {
            if (i%j == 0) {
                return false;
            }
        }
        return true;
    }
}