// write your code here
import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            HashSet<Integer> set = new HashSet<>();
            int i = 2;
            while (i < Math.sqrt(n)) {
                while (n%i == 0) {
                    set.add(i);
                    n /= i;
                }
                i++;
            }

            /**
             * ！！！！注意，如果最后的结果不是1 代表在比sqrt(n)大的数字里面还有一个是质因数，但是没有被算在set里面
             * 比如26    sqrt(26) == 5.几
             * i == 2开始计算       2 < 5.几    n = 13
             * i == 3    3 < 3.几
             * i == 4    4 < 3.几不成立，  但是set里面没有存储13这个值
             */

           //如果不进行sqrt直接计算，会导致世家复杂度过大
            if (n !=1) {
                System.out.println(set.size()+1);
            } else {
                System.out.println(set.size());
            }
        }
    }
}