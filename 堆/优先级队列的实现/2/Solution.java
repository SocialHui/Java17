import java.util.Arrays;

class Solution {
    public int[] elem;
    public int size;

    public Solution() {
        this.elem = new int[10];
    }

    public void heapSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            this.elem[i] = array[i];
            size++;
        }
        for (int i = size-1; i >= 0; i--) {
            shiftSort((i-1)/2,this.size);
        }
        for (int i = 0; i < size; i++) {
            System.out.print(this.elem[i] + " ");
        }
        System.out.println();
    }

    public void shiftSort(int parent, int len) {
        int child = 2*parent+1;
        while (child < len) {
            if (child+1 < len && this.elem[child+1] > this.elem[child]) {
                child++;
            }
            if (this.elem[child] > this.elem[parent]) {
                int tmp = this.elem[child];
                this.elem[child] = this.elem[parent];
                this.elem[parent] = tmp;
            }
            parent = child;
            child = parent*2+1;
        }
    }

    public void put(int val) {
        //这里需要判断数组是否是满的，如果是满的，需要进行扩容
        if (size == this.elem.length) {
            kuo();
        }
        this.elem[size++] = val;
        upSort(size-1);
        for (int i = 0; i < size; i++) {
            System.out.print(this.elem[i] + " ");
        }
        System.out.println();
    }

    public void kuo() {
        this.elem = Arrays.copyOf(this.elem,size*2);
    }

    public void upSort(int child) {
        int parent = (child-1)/2;
        while (parent >= 0) {
            if (this.elem[parent] < this.elem[child]) {
                int tmp = this.elem[parent];
                this.elem[parent] = this.elem[child];
                this.elem[child] = tmp;
                child = parent;
                parent = (child-1)/2;
            } else {
                break;
            }
        }
    }

    public void remove() {
        int tmp = this.elem[size-1];
        this.elem[size-1] = this.elem[0];
        this.elem[0] = tmp;
        this.size--;
        shiftSort(0,size-1);
        for (int i = 0; i < size; i++) {
            System.out.print(this.elem[i] + " ");
        }
        System.out.println();
    }
}
