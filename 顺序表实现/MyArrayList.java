import java.util.Arrays;

public class MyArrayList {

    private int[] arr;
    private int useNum;

    public MyArrayList () {
        this.arr = new int[10];
    }

    //先判断数组是否是满的
    public boolean isFull() {
        if (this.arr.length == this.useNum) {
            System.out.println("数组是满的");
            return true;
        } else {
            return false;
        }
    }

    //判断位置是否正确
    public int weiZhi(int pos) {
        if (pos < 0 || pos > this.useNum) {
            System.out.println("位置有误");
            return -1;
        } else {
            return 1;
        }
    }

    //将数组填入几个数字
    public void add(int pos) {
        if (isFull() == true) {
            return;
        }
        System.out.println("将数组填入几个数字");
        for (int i = 0; i < pos ; i++) {
            this.arr[i] = i;
            this.useNum++;
        }
        for (int i = 0; i < this.useNum; i++) {
            System.out.print(this.arr[i]+" ");
        }
        //System.out.print(Arrays.toString(this.arr));
        System.out.println();
    }

    //给pos位置的元素设置为value
    public void setPos(int pos,int value) {
        if (weiZhi(pos) == -1) {
            return;
        }
        System.out.println("给pos位置的元素设置为value");
        this.arr[pos] = value;
        for (int i = 0; i < this.useNum; i++) {
            System.out.print(this.arr[i]+" ");
        }
        //System.out.print(Arrays.toString(this.arr));
        System.out.println();
    }

    //打印顺序表
    public void disPlay() {
        System.out.println("打印顺序表");
        System.out.print(Arrays.toString(this.arr));
        System.out.println();
    }

    //在pos位置新增元素
    public void add (int pos, int data) {
        if(isFull() == true) {
            return;
        }
        System.out.println("在pos位置新增元素");
        for (int i = this.useNum-1; i >=pos ; i--) {
            this.arr[i+1] = this.arr[i];
        }
        this.arr[pos] = data;
        this.useNum++;
        for (int i = 0; i < this.useNum; i++) {
            System.out.print(this.arr[i]+" ");
        }
        System.out.println();
        //System.out.println(Arrays.toString(this.arr));
    }

    //判定是否包含某个元素
    public boolean contains(int toFind) {
        System.out.println("判定是否包含某个元素");
        for (int i = 0; i < this.useNum ; i++) {
            if(this.arr[i] == toFind) {
                 return true;
            }
        }
        return false;
    }

    //查找某个元素对应的位置
    public int search (int toFind) {
        System.out.println("查找某个元素对应的位置");
        for (int i = 0; i < this.useNum ; i++) {
            if(this.arr[i] == toFind) {
                return i;
            }
        }
        return -1;
    }

    //获取pos位置的元素
    public int getPos(int pos) {
        if(weiZhi(pos) == -1) {
            return -1;
        }
        System.out.println("获取pos位置元素");
        return this.arr[pos];
    }

    //获取顺序表长度
    public int size() {
        System.out.println("获取顺序表长度");
        return this.useNum;
    }

    //删除第一次出现的关键字key
    public void remove(int toRemove) {
        int n = search(toRemove);
        if (n == -1) {
            System.out.println("没有这个关键字");
            return;
        }
        System.out.println("删除第一次出现的关键字key");
        for (int i = n; i < this.useNum-1 ; i++) {
            this.arr[i] = this.arr[i+1];
        }
        this.useNum--;
        for (int i = 0; i < this.useNum; i++) {
            System.out.print(this.arr[i]+" ");
        }
    }

}
