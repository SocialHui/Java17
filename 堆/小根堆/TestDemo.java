import java.util.Arrays;

public class TestDemo {
    public static void main(String[] args) {
        int[] array = {27,15,19,18,28,34,65,49,25,37};
        System.out.println(Arrays.toString(array));
        HeapDemo heapDemo = new HeapDemo(array,array.length);
        heapDemo.createdSmallHeap();
        heapDemo.show();
    }
}
