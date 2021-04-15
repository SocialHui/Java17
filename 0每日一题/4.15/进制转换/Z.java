import java.util.*;
public class Z{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String str = sc.nextLine();
            String[] s = str.split(" ");
            int n = Integer.parseInt(s[0]);  //需要转换的十进制数字
            int m = Integer.parseInt(s[1]);  //转换成几进制的数字
            StringBuilder builder = new StringBuilder();
            while (n > 0) {
                int rem = n % m;  //余数
                if (rem > 9) {
                    rem = 65 + rem - 10;
                    char ch = (char) rem;
                    builder.append(ch);
                } else {
                    builder.append(rem);
                }
                n = n / m;
            }
            //将得到的builder反转输出就是所需的m进制数字
            System.out.println(builder.reverse());
        }
    }
}