import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();  //代表第几行
            int[][] nums = new int[n][2*n-1];
            
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < 2*(i+1)-1; j++) {
                    if (j == 0) {
                        //代表是每一行的第一个数字，全部都是1
                        nums[i][j] = 1;
                    } else if (j == 1){
                        nums[i][j] = nums[i-1][j-1] + nums[i-1][j];
                    } else {
                        nums[i][j] = nums[i-1][j-2] + nums[i-1][j-1] + nums[i-1][j];
                    }
                }
            }
            //判断第n行的第一个偶数的位置
            int i = 0;
            boolean flag = true;
            while (i < n) {
                if (nums[n-1][i++]%2 == 0) {
                    System.out.println(i);
                    flag = false;
                    break;
                }
            }
            if (flag) {
                System.out.println(-1);
            }
        }
    }
}
