import java.util.Arrays;

public class TestDemo {
    public static void main(String[] args) {
        int[] array = {27,15,19,18,28,34,65,49,25,37};
        HeapDemo heapDemo = new HeapDemo();
        System.out.println(Arrays.toString(array));

//        heapDemo.createdBigHeap(array);
//        heapDemo.show();

        heapDemo.createdSmallHeap(array);
        heapDemo.show();
        heapDemo.push(100);
        heapDemo.show();
        System.out.println(heapDemo.poll());
        heapDemo.show();
    }
}
