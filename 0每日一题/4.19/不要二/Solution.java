import java.util.*;

public class Solution{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int w = sc.nextInt();  //列
            int h = sc.nextInt(); //行
            int n = 0;
            int[][] arr = new int[h][w];
            for (int i = 0; i < h; i++) {
                for (int j = 0; j < w; j++) {
                    if (arr[i][j] != -1) {
                        //代表这里可以放蛋糕
                        n++;
                        if (i+2 < h) {
                            arr[i+2][j] = -1;
                        }
                        if (j+2 < w) {
                            arr[i][j+2] = -1;
                        }
                    }
                }
            }
            System.out.println(n);
        }
    }
}