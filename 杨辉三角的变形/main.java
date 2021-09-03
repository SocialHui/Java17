import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            int[][] nums = new int[n][2*n-1];   //初始默认全部为0
            nums[0][0] = 1;
            for (int i = 1; i < nums.length; i++) {
                for (int j = 0; j < 2*(i+1)-1; j++) {
                    if (j == 0) {
                        nums[i][j] = nums[i-1][j];
                    } else if (j == 1) {
                        nums[i][j] = nums[i-1][j] + nums[i-1][j-1];
                    } else {
                        nums[i][j] = nums[i-1][j] + nums[i-1][j-1] + nums[i-1][j-2];
                    }
                }
            }
            int i = 0;
            boolean flag = false;
            while (i < 2*n-1) {
                if (nums[n-1][i]%2 == 0) {
                   flag = true;
                   break;
                }
                i++;
            }
            if (flag) {
                System.out.println(i+1);
            } else {
                System.out.println(-1);
            }
        }
    }
}