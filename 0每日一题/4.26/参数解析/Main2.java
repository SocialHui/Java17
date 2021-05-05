import java.util.*;

public class Main2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String str = sc.nextLine();

            StringBuffer s = new StringBuffer();
            Queue<StringBuffer> queue = new LinkedList<>();   //用来存放参数的容器

            int n = 0;   //代表“的个数

            for (int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);
                if (ch == '\"'){
                    n++;
                    continue;   //我怎么就想不到
                }

                if (ch != ' '){
                    s.append(ch);
                } else if (n%2 == 0) {
                    //代表结束
                    queue.offer(s);
                    s = new StringBuffer();
                } else {
                    s.append(" ");
                }
            }
            queue.offer(s);

            System.out.println(queue.size());
            while (!queue.isEmpty()) {
                System.out.println(queue.poll());
            }
        }
    }
}
