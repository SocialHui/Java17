import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String s1 = sc.nextLine();
            String s2 = sc.nextLine();

            //注意题目说的输出较短的第一次出现的
            if (s1.length() > s2.length()) {
                String sm = s1;
                s1 = s2;
                s2 = sm;
            }

            //用来存放最终需要输出的字符串
            StringBuilder str = new StringBuilder();

            //外层遍历较短的字符串，可以保证题目要求的如果长度相同输出较短的第一次出现的
            for (int i = 0; i < s1.length(); i++) {

                for (int j = 0; j < s2.length(); j++) {
                    if (s1.charAt(i) == s2.charAt(j)) {

                        //暂时存放相同的字符串
                        StringBuilder s = new StringBuilder();
                        int s1L = i;
                        int s2L = j;

                        while (s1L < s1.length() && s2L < s2.length()) {
                            if (s1.charAt(s1L) == s2.charAt(s2L)) {
                                s.append(s1.charAt(s1L));
                            } else {
                                break;
                            }
                            s1L++;
                            s2L++;
                        }
                        
                        //如果新的字符串相同的长度比之前的长，就进行替换
                        if (s.length() > str.length()) {
                            str = s;
                        }

                    }
                }

            }
            
            //如果str的长度不为空，就代表有相同的字符串
            if (str.length() != 0) {
                System.out.println(str.toString());
            }
        }
    }
}
