import java.util.Arrays;

public class MyStack {
    public int[] elem;
    public int size;

    public MyStack() {
        this.elem = new int[10];
    }

    public void push(int val) {
        if (size == this.elem.length) {
            expansion();
        }
        this.elem[size] = val;
        size++;
    }

    public void show() {
        for (int i = 0; i < this.size; i++) {
            System.out.print(this.elem[i]+" ");
        }
        System.out.println();
    }

    public void expansion() {
        this.elem = Arrays.copyOf(this.elem,this.elem.length*2);
    }

    public int get() {
        return this.elem[size-1];
    }

    public void remove() {
        this.size--;
    }

}
