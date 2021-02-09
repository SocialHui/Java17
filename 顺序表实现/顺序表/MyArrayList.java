import java.util.Arrays;

public class MyArrayList {
    private int[] elem;
    private int usedSize;

    public MyArrayList () {
        this.elem = new int[10];
    }

    public MyArrayList (int capacity)  {
        this.elem = new int[capacity];
    }

    public void display() {
        for (int i = 0; i < this.usedSize; i++) {
            System.out.print(this.elem[i] + "  ");
        }
        System.out.println();
    }

    public boolean isFull () {
        return this.elem.length == this.usedSize;
    }

    //扩容
    public void resize() {
        this.elem = Arrays.copyOf(this.elem,2*this.elem.length);
    }

    public void add(int pos, int data) {
        if (pos < 0 || pos > this.usedSize) return;  //代表插入位置不正确
        if (isFull()) {
            //resize();   //满了就扩容
            return;       //代表数组已经满了，插不进去了
        }
        for (int i = this.usedSize; i > pos ; i--) {
            this.elem[i] = this.elem[i-1];
        }
        this.elem[pos] = data;
        this.usedSize++;
    }

    public void addLast(int data) {
        if (isFull()) {
            return;
        }
        this.elem[this.usedSize] = data;
        this.usedSize++;
    }

    public boolean contains (int toFind) {
        for (int i = 0; i < this.usedSize; i++) {
            if (toFind == this.elem[i]) {
                return true;
            }
        }
        return false;
    }

    public int search (int toFind) {
        for (int i = 0; i < this.usedSize; i++) {
            if (this.elem[i] == toFind) {
                return i;
            }
        }
        return -1;
    }

    public int size () {
        return this.usedSize;
    }

    public int getPos (int pos) {
        if (pos < 0 || pos >= this.usedSize) return -1;
        return this.elem[pos];
    }

    public void setPos(int pos, int data) {
        if (pos < 0 || pos >= this.usedSize) return;
        this.elem[pos] = data;
    }

    //删除第一次出现的关键字
    public void delete (int key) {
//        for (int i = 0; i < this.usedSize; i++) {
//            if (key == this.elem[i]) {
//                int index = i;
//                for (int j = index; j < this.usedSize-1 ; j++) {
//                    this.elem[i] = this.elem[i+1];
//                }
//                this.usedSize--;
//            }
//        }
        int index = search(key);
        if (index == -1) return;
        for (int i = index; i < this.usedSize - 1; i++) {
            this.elem[i] = this.elem[i + 1];
        }
        this.usedSize--;
    }

    public void clear() {
        this.usedSize = 0;
    }

}
