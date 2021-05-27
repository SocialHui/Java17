// write your code here
import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String str = sc.nextLine();
            String s = sc.nextLine();
            int count = 0;  //代表”的个数
            StringBuilder builder = new StringBuilder();
            HashSet<String> set = new HashSet<String>();
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == '\"'){
                    count++;
                } else if (str.charAt(i) == ','){
                    //先判断“的个数
                    if (count%2 == 0) {
                        //代表到这里已经结束了一个人的名字
                        set.add(builder.toString());
                        builder = new StringBuilder();
                    } else {
                        builder.append(str.charAt(i));
                    }
                } else {
                    builder.append(str.charAt(i));
                }
            }
            //注意注意！！！！！！当最后一个值是不带”“的时候，循环遍历结束以后没有把最后自已字符串放进去
            //例如："Zhang Joe","Zhang, Joe",Kewell
                   //Kewell
            set.add(builder.toString());
            //然后判断set里面是否存在s
            if (set.contains(s)) {
                System.out.println("Ignore");
            } else {
                System.out.println("Important!");
            }
        }
    }
}