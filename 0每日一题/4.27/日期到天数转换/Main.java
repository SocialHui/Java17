import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String str = sc.nextLine();
            String[] strs = str.split(" ");
            int[] nums = new int[strs.length];
            for (int i = 0; i < strs.length; i++) {
                nums[i] = Integer.parseInt(strs[i]);
            }
            //已经将年月日存放在nums里面了，现在需要判断这一年是不是闰年，这个月有几天
            int num = tian(nums[0],nums[1],nums[2]);
            System.out.println(num);
        }
    }
    public static int tian(int year, int month, int day) {
        //平年二月有28天，闰年二月有29天
        int[] months = {31,28,31,30,31,30,31,31,30,31,30,31};
        int days = 0;   //用来计是多少天
        if (year < 0 || month <= 0 || month > 12 || day <= 0 || day > 31) {
            return -1;
        } else {
            //先判断是不是闰年
            if ((year%4 == 0 && year%100 != 0) || (year%400 == 0)) {
                //满足上面两个条件的任意一个就代表是闰年
                //闰年的2月有29天
                int n = 0;
                while (n < month-1) {
                    if (n == 1) {
                        //代表是二月
                        days += 29;
                    } else {
                        days += months[n];
                    }
                    n++;
                }
            } else {
                //不是闰年
                int n = 0;
                while (n < month-1) {
                        days += months[n];
                    n++;
                }
            }
        }
        return days+day;
    }
