import java.util.Arrays;

/**
 * 栈是用数组实现的
 * 在数组的尾部进行插入和删除操作
 */

class MyStack {
    private int[] array;
    private int size;

    MyStack(int s) {
        array = new int[s];
    }

    public void add(int n) {
        if (size == array.length) {
            //代表数组满了，需要进行扩容
            kuo();
        }
        array[size++] = n;
    }

    public void kuo() {
        int[] array2 = Arrays.copyOf(array,array.length*2);
        array = array2;
    }

    public void show() {
        for (int i = 0; i < size; i++) {
            System.out.print(array[i]+" ");
        }
    }
}

