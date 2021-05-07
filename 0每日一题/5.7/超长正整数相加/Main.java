import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String addend = sc.nextLine();
            String augend = sc.nextLine();
            StringBuilder builder = new StringBuilder();   //用来存放最终的输出结果

            String maxL = null;
            String minL = null;
            if (addend.length() > augend.length()) {
                maxL = addend;
                minL = augend;
            } else {
                maxL = augend;
                minL = addend;
            }

            int i = minL.length() - 1;   //从字符串的最右端开始计算（相当于一个数字的最低位开始计算）
            int num = 0;   //代表进位

            for (; i >= 0; i--) {
                int number1 = Integer.parseInt(minL.charAt(i) + "");
                int number2 = Integer.parseInt(maxL.charAt(i) + "");
                int sum = number1 + number2 + num;
                if (sum > 9) {
                    //需要考虑进位
                    builder.append(sum % 10);
                    num = sum / 10;
                } else {
                    builder.append(sum);
                }
            }

            i = maxL.length() - minL.length() - 1;

            while (i >= 0) {
                int sum = Integer.parseInt(maxL.charAt(i) + "") + num;
                if (sum > 9) {
                    builder.append(sum % 10);
                    num = sum / 10;
                } else {
                    builder.append(sum);
                }
                i--;
            }
            if (num >= 1) {
                builder.append(num);
            }
            System.out.println(builder.reverse().toString());
        }
    }
}