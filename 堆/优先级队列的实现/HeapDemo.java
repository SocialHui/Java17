import java.util.Arrays;

public class HeapDemo {

    private int[] elem;
    private int usedSize;

    public HeapDemo(int[] elem, int usedSize) {
        this.elem = elem;
        this.usedSize = usedSize;
    }

    public void adjustDown(int parent, int len) {
        int child = 2*parent+1;
        while (child < len) {
            if (child+1 < len && this.elem[child] > this.elem[child+1]) {
                child++;
            }
            if (this.elem[child] < this.elem[parent]) {
                int tmp = this.elem[child];
                this.elem[child] = this.elem[parent];
                this.elem[parent] = tmp;
                parent = child;
                child = 2*parent+1;
            } else {
                break;
            }
        }
    }

    public void show() {
        for (int i = 0; i < this.usedSize; i++) {
            System.out.print(this.elem[i] + " ");
        }
        System.out.println();
    }


    public void createdSmallHeap() {
        for (int i = (this.usedSize-1-1)/2; i >= 0; i--) {
            adjustDown(i,this.usedSize);
        }
    }

    //入队
    public void push(int val) {
        if (isFull()) {
            //满的时候进行扩容
            this.elem = Arrays.copyOf(this.elem,this.usedSize*2);
        }
        this.elem[this.usedSize] = val;
        this.usedSize++;
        adjustUp(this.usedSize-1);
    }

    //向上调整
    public void adjustUp(int child) {
        int parent = (this.usedSize-1)/2;
        while (parent >= 0) {
            if (this.elem[child] < this.elem[parent]) {
                int tmp = this.elem[child];
                this.elem[child] = this.elem[parent];
                this.elem[parent] = tmp;
                child = parent;
                parent = (child-1)/2;
            } else {
                break;
            }
        }
    }

    public int pop() {
        if (isEmpty()) {
            return -1;
        }
        int tmp = this.elem[0];
        this.elem[0] = this.elem[this.usedSize-1];
        this.elem[usedSize-1] = tmp;
        this.usedSize--;
        adjustDown(0,this.usedSize);
        return tmp;
    }

    public int peek() {
        if (isEmpty()) {
            return -1;
        }
        return this.elem[0];
    }

    public boolean isEmpty() {
        return this.usedSize == 0;
    }

    public boolean isFull() {
        return this.elem.length == this.usedSize;
    }

}
