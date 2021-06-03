import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long r[] = new long[21];   //没有领到奖品的人数
        long f[] = new long[21];   //总共有多少种可能,共有多少种排列组合
        r[0] = 0;
        r[1] = 0;
        r[2] = 1;

        f[0] = 1;
        f[1] = 1;
        f[2] = 2;

        for (int i = 3; i < r.length; i++) {
            r[i] = (i-1)*(r[i-1]+r[i-2]);
            f[i] = f[i-1]*i;
        }

        while (sc.hasNext()) {
            int n = sc.nextInt();
            System.out.printf("%.2f%%\n",100.0*r[n]/f[n]);  //注意输出的格式
        }
    }
}