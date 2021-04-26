import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int year = sc.nextInt();
            int month = sc.nextInt();
            int day = sc.nextInt();
            int Day = Days(year,month,day);
            System.out.println(Day);
        }
    }
    
    public static int Days(int year, int month, int day) {
        int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if (year %4 == 0 && year %100 != 0 || year %400 == 0) {
            //代表是闰年，二月有29天，平年的二月都是28天
            days[1] = 29;
        }
        if (year <= 0 || month <= 0 || month > 12 || day <= 0 || day > days[month-1]) {
            return -1;
        }
        int sum = 0;
        for (int i = 0; i < month-1; i++) {
            sum += days[i];
        }
        return sum+day;
    }
}
