import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String str = sc.nextLine();
            boolean flag = true;
            for (int i = 0; i < str.length(); i++) {
                if (!str.substring(i+1,str.length()).contains(str.charAt(i)+"")){
                    if (i-1>=0 && str.charAt(i-1)==str.charAt(i)) {
                        continue;
                    }
                    System.out.println(str.charAt(i));
                    flag = false;
                    break;
                }
            }
            if (flag) {
                System.out.println(-1);
            }
        }
    }
}