import java.util.*;

public class Solution{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            int[] array = new int[4];
            for (int i = 0; i < array.length; i++) {
                array[i] = sc.nextInt();
            }
            StringBuilder builder = new StringBuilder();
            if ((array[0]+array[2])%2 == 0 && (array[0]+array[2])/2 >= 0) {
                //代表A存在
                int A = (array[0]+array[2])/2;
                builder.append(A);
                builder.append(" ");
                if ((array[1]+array[3])%2 == 0 && (array[1]+array[3])/2 >= 0) {
                    //代表B也存在
                    int B = (array[1]+array[3])/2;
                    builder.append(B);
                    builder.append(" ");
                    if (B-array[1] >= 0) {
                        int C = B-array[1];
                        builder.append(C);
                        System.out.println(builder.toString());
                        return;
                    }
                }
            }
            System.out.println("No");
        }
    }
}
