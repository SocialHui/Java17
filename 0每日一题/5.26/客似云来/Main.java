// write your code here
import java.util.*;
//题目的意思就是求第from个 到 to个 的斐波那契数的和
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int from = sc.nextInt();
            int to = sc.nextInt();

            long sum = 0;
            long n1 = 1;
            long n2 = 1;
            int n = 1;   //判断是第几天，也就是第几个斐波那契数
            while (n != to+1) {
                if (n >= from) {
                    //代表已经是题目要求的开始的天数了
                    sum += n1;
                }
                long tmp = n1 + n2;
                n1 = n2;
                n2 = tmp;
                n++;
            }
            System.out.println(sum);
        }
    }
}