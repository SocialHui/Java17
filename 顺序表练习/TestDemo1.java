import java.util.ArrayList;
import java.util.Collections;

public class TestDemo {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(5);
        list.add(15);
        Collections.sort(list);  //默认从小到大排序
        System.out.println(list);
    }
}

