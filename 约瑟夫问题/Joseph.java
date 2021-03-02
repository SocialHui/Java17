import java.util.*;

public class Joseph {
    public int getResult(int n) {
        // write code here
        if (n < 1) {
            return -1;
        }
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 1; i <= n; i++) {
            list.add(n);
        }
        int i = 0;
        int count = 2;
        int cur = 0;
        while (list.size() > 1) {
            i = 0;
            while (list.size() > 1 && i < list.size()) {
                cur = (cur+1)%count;
                if (cur != 1) {  //代表这个人报的号是1，不能删除这个人
                    list.remove(i);
                } else {
                    i++;
                }
            }
            count++;
            cur = 0;
            if (list.size() > 1) {
                int last = list.removeLast();
                list.addFirst(last);
            }
        }
        return list.pop();
    }
}
