import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();   //输入代表行数的数字
            //建立一个二位数组，存放n行的杨辉三角的数字
            int[][] nums = new int[n+1][2*n];   
            nums[1][1] = 1;
            for (int i = 2; i <= n; i++) {
                //代表行数的增加
                nums[i][1] = 1;
                for (int j = 2; j < 2*i; j++){
                    nums[i][j] = nums[i-1][j-2] + nums[i-1][j-1] + nums[i-1][j];
                }
            }

            //已经将所有的杨辉三角的数字放进去了
            //判断这一行的第一个偶数在哪
            boolean flag = true;
            for (int i = 1; i < 2*n; i++) {
                if (nums[n][i]%2 == 0) {
                    //代表是第一个偶数
                    System.out.println(i);
                    flag = false;   //代表已经输出过了
                    break;
                }
            }
            if (flag) {
                //代表没有输出过
                System.out.println(-1);
            }
        }
    }
}
