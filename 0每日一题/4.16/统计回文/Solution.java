import java.util.*;
public class Solution{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String A = sc.nextLine();
            String B = sc.nextLine();
            StringBuilder builder = new StringBuilder();
            int num = 0;
            int i = 0;
            while (i <= A.length()) {
                //将字符串B拼接到字符串A上
                builder.append(A.substring(0, i));
                builder.append(B);
                builder.append(A.substring(i, A.length()));

                //判断是不是回文结构
                int left = 0;
                int right = builder.length()-1;
                boolean isHuiWen = true;
                while (left < right) {
                    if (builder.charAt(left) != builder.charAt(right)) {
                        isHuiWen = false;
                        break;
                    }
                    left++;
                    right--;
                }
                if (isHuiWen) {
                    num++;
                }
                builder = new StringBuilder();
                i++;
            }
            System.out.println(num);
        }
    }
}
