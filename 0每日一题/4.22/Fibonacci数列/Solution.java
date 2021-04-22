import java.util.*;

public class Solution{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            int f0 = 0;
            int f = 1;
            int fl = f0+f;  //较小的数字
            while (true) {
                int fr = f+fl;   //较大的数字
                if (n >= fl && n <= fr) {
                    //代表这个数字在这个区间内，然后进行判断他距离那一边比较近
                    int leftLength = n-fl;
                    int rightLength = fr-n;
                    if (leftLength > rightLength) {
                        //代表数字距离右边比较近
                        System.out.println(rightLength);
                    } else {
                        System.out.println(leftLength);
                    }
                    break;
                } else {
                    //代表数字不在这个区间范围内
                    f = fl;
                    fl = fr;
                }
            }
        }
    }
}


