import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String str = sc.nextLine();
            String s = sc.nextLine();
            int count = 0;  //用来记录"的个数
            StringBuilder builder = new StringBuilder();
            HashSet<String> set = new HashSet<>();  //用来存放不重要的人的信息
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == ',') {
                    //判断要不要进行分割
                    if (count%2 == 0) {
                        set.add(builder.toString());
                        builder = new StringBuilder();
                    } else {
                        builder.append(str.charAt(i));
                    }
                } else if (str.charAt(i) == '\"') {
                    count++;
                } else {
                    builder.append(str.charAt(i));
                }
            }
            set.add(builder.toString());  //注意一定要将最后一个放在set里面
            if (set.contains(s)) {
                System.out.println("Ignore");
            } else {
                System.out.println("Important!");
            }
        }
    }
}