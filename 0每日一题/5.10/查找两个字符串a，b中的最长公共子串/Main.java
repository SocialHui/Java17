import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String s1 = sc.nextLine();
            String s2 = sc.nextLine();
            StringBuilder str = new StringBuilder();   //存放最终需要输出的字符串

            for (int i = 0; i < s1.length(); i++) {

                for (int j = 0; j < s2.length(); j++) {

                    if (s1.charAt(i) == s2.charAt(j)) {
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
                        if (s.length() > str.length()) {
                            str = s;
                        }

                    }

                }

            }

            if (str.length() != 0) {
                System.out.println(str.toString());
            }

        }
    }
}