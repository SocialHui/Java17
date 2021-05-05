
import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int N = sc.nextInt();
            int left = 0;
            int right = 1;
            while (true) {
                if (N >= left && N <= right) {
                    //代表N在这两个斐波那契数之间
                    //判断这个数字距离左边的距离和右边的距离哪个小
                    if (right - N < N - left) {
                        System.out.println(right - N);
                    } else {
                        System.out.println(N - left);
                    }
                    break;
                } else {
                    //代表这个数不在这个范围内，继续向下寻找
                    int tmp = left + right;
                    left = right;
                    right = tmp;
                }
            }
        }
    }
}


