import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int group = sc.nextInt();

        while (group-- > 0 ) {

            int n = sc.nextInt();
            int k = sc.nextInt();  //代表洗牌的次数
            int[] nums = new int[2 * n];
            for (int i = 0; i < 2 * n; i++) {
                nums[i] = sc.nextInt();
            }

            while (k-- > 0) {
                int[] tmp = new int[2 * n];
                int j = 0;
                for (int i = 0; i < 2*n; i+=2) {
                    tmp[i] = nums[j];
                    tmp[i + 1] = nums[(j++) + n];
                }
                nums = tmp;
            }

            //接下来进行输出
            for (int i = 0; i < 2 * n; i++) {
                if (i != 2 * n - 1) {
                    System.out.print(nums[i] + " ");
                } else {
                    System.out.println(nums[i]);
                }
            }
        }
    }
}