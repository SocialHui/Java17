import java.util.*;

public class Solution{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n1 = sc.nextInt();  //列
            int n2 = sc.nextInt();  //行
            int[][] arr = new int[n2][n1];
            int num = 0;
            for (int i = 0; i < n2; i++) {
                for (int j = 0; j < n1; j++) {


                    if (arr[i][j] != -1){
                        num++;
                        if (j+2 < n1) {
                            arr[i][j+2] = -1;
                        }
                        if (i+2 < n2) {
                            arr[i+2][j] = -1;
                        }
                    }


                }
            }
            System.out.println(num);
        }
    }
}