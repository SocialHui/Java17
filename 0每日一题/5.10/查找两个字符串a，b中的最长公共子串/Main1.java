import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            String s1 = in.nextLine();
            String s2 = in.nextLine();
            String max = s1.length() >= s2.length()?s1:s2;
            String min = s1.length() >= s2.length()?s2:s1;
            
           //注意这里不能定义s = null,定义了这个就会报错
            String s = "";
            for (int i = 0; i < min.length(); i++) {
                for (int j = i+1; j <= min.length(); j++) {
                    if (max.contains(min.substring(i,j)) && j-i > s.length()) {
                        s = min.substring(i,j);
                    }
                }
            }
            System.out.println(s);
        }
    }
}