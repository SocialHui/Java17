import java.util.*;
/*编程题 数字+字符+字母
        挑出字母 从小到大排序，得到第三个字母 （这里调用了java中的排序函数）*/
//建大堆
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String str = sc.nextLine();
            PriorityQueue<Character> queue = new PriorityQueue<>(3, new Comparator<Character>() {
                @Override
                public int compare(Character o1, Character o2) {
                    return o2-o1;
                }
            });
            for (int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);
                if (Character.isLetter(ch)) {
                    //代表它是一个字母，接下来将它
                    if (queue.size() < 3) {
                        queue.add(ch);
                    } else {
                        if (queue.peek() > ch) {
                            queue.poll();
                            queue.add(ch);
                        }
                    }
                }
            }
            System.out.println(queue.peek());
        }
    }
}