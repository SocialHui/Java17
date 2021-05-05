import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int max = 0;   //代表最大连续的
            int lian = 0;   //代表连续的
            int num = sc.nextInt();
            //接下来判断有几个连续的1
            //思路，无符号右移>>>
            while (num > 0) {
                if ((num & 1) == 1) {
                    while (num > 0 && (num & 1) == 1) {
                        //代表是1
                        lian++;
                        num >>>= 1;
                    }
                } else {
                    num >>>= 1;
                }
                if (lian > max) {
                    max = lian;
                }
                lian = 0;
            }
            System.out.println(max);
        }
    }
}