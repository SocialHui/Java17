import java.util.Arrays;

public class MyArrayList {
    private int[] elem;
    private int usedSize;

    @Override
    public String toString() {
        return "MyArrayList{" +
                "elem=" + Arrays.toString(elem) +
                '}';
    }

    public MyArrayList(){
        this.elem = new int[10];
    }

    public MyArrayList(int capacity){
        this.elem = new int[capacity];
    }

    //判断顺序表是否是满的
    public boolean isEmpty(){
        if (this.usedSize == this.elem.length){
            return true;
        }
        return false;
    }

    //在pos位置新增元素
    public void add(int pos,int data) {
        if(isEmpty()){
            System.out.println("顺序表已满");
           return;
        }
        if(pos < 0 || pos > this.usedSize){
            System.out.println("pos位置不合法");
            return;
        }
        for (int i = this.usedSize-1; i >= pos; i--) {
            this.elem[i+1] = this.elem[i];
        }
        this.elem[pos] = data;
        this.usedSize++;
    }

    //判定是否包含某个元素
    public boolean contains(int toFind) {
        for (int i = 0; i < this.usedSize; i++) {
            if(this.elem[i] == toFind){
                return true;
            }
        }
        return false;
    }

    //查找某个元素的对应位置
    public int toFind(int data){
        for (int i = 0; i < this.usedSize; i++) {
            if(this.elem[i] == data){
                return i;
            }
        }
        return -1;
    }

    //打印顺序表
    public void disPlay(){
        for (int i = 0; i < this.usedSize; i++) {
            System.out.print(this.elem[i] + " ");
        }
    }

    //获取顺序表长度
    public int size(){
        return this.usedSize;
    }

    //给pos位置的元素设置为value
    public void setPos(int pos, int value){
        if(pos < 0 || pos >= this.usedSize){
            return;
        }
        this.elem[pos] = value;
    }

    //删除第一次出现的关键字key
    public void remove(int key) {
        if(toFind(key) == -1){
            return;
        }
        int m = toFind(key);
        for (int i = m; i < this.usedSize-1; i++) {
            this.elem[i] = this.elem[i+1];
        }
        this.usedSize--;
    }

    //清空顺序表
    public void clear(){
        this.usedSize = 0;
    }

}


