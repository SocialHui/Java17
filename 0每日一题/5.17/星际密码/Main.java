import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            int[] nums = new int[n];
            for (int i = 0; i < nums.length; i++) {
                nums[i] = sc.nextInt();
            }

            //用来存放最终的密码
            StringBuilder builder = new StringBuilder();

            for (int i = 0; i < nums.length; i++) {

                //去判断这个数字的解码,斐波那契数
                String num = mima(nums[i]);

                if (num.length() > 4) {
                    //后四位是密码
                    builder.append(num.substring(num.length()-4,num.length()));

                } else if (num.length() == 4){
                    //这四位就是密码
                    builder.append(num);
                } else {
                    //需要在这几位前面补0变为密码
                    int len = 0;
                    int s = Integer.parseInt(num);

                    //判断需要补几个0，首先判断这个数字到底是几位
                    while (s != 0) {
                        len++;
                        s /= 10;
                    }

                    //在前面补0
                    while (4-len != 0) {
                        builder.append(0);
                        len++;
                    }
                    builder.append(num);
                }
            }
            System.out.println(builder.toString());
        }
    }

    //判断第num个斐波那契数是多少
    //因为计算的时候可能超过int类型的范围，所以直接用String计算
    private static String mima(int num) {
        String s0 = "1";
        String s1 = "1";
        if (num == 0) {
            return s0;
        }
        if (num == 1) {
            return s1;
        }
        int y = 0;  //代表进位
        StringBuilder builder = new StringBuilder();
        //求第num个
        while (num-- > 1) {
            builder = new StringBuilder();
            int i = s0.length()-1;
            //对前面的进行求和
            int j = s1.length()-1;

            for (; i >= 0; i--) {
                int sum = Integer.parseInt(s0.charAt(i)+"")+Integer.parseInt(s1.charAt(j--)+"")+y;
                y = sum/10;
                builder.append(sum%10);
            }
            if (j >= 0) {
                int sum = Integer.parseInt(s1.charAt(j)+"")+y;
                y = sum/10;
                builder.append(sum%10);
                j--;
            }
            if (y > 0) {
                builder.append(y);
            }

            y = 0;
            s0 = s1;
            s1 = builder.reverse().toString();
        }
        return builder.toString();
    }
}