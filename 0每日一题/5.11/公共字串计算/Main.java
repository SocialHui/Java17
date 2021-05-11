import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String str1 = sc.nextLine().toLowerCase();
            String str2 = sc.nextLine().toLowerCase();
            int max = 0;
            for (int i = 0; i < str1.length(); i++) {
                
                for (int j = 0; j < str2.length(); j++) {
                    if (str1.charAt(i) == str2.charAt(j)) {
                        int numJ = j;
                        int numI = i;
                        int n = 0;
                        while (numI < str1.length() && numJ < str2.length() && str1.charAt(numI) == str2.charAt(numJ)) {
                            n++;
                            numI++;
                            numJ++;
                        }

                        if (n > max) {
                            max = n;
                        }
                    }
                }
            }
            System.out.println(max);
        }
    }
}