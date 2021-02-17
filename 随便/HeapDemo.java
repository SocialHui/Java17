import java.util.Arrays;

public class HeapDemo {
    //参数
    public int[] elem;
    public int usedSize;

    public HeapDemo() {
        this.elem = new int[10];
    }

    //大根堆
//    /**
//     * len代表结束位置
//     * @param parent
//     * @param len
//     * child parent 都代表下标
//     */
//    public void adjustDown (int parent, int len) {
//        int child = 2*parent + 1;
//        //child < len ,说明一定有左孩子，但不知道有没有右孩子
//        while (child < len) {
//
//            if (child + 1 < len && this.elem[child+1] > this.elem[child]) {
//                child = child+1;
//            }
//
//            //child下标一定是左右孩子的最大值下标
//            if (this.elem[child] > this.elem[parent]) {
//                int tmp = this.elem[parent];
//                this.elem[parent] = this.elem[child];
//                this.elem[child] = tmp;
//                parent = child;
//                child = 2*parent + 1;
//            } else {
//                //因为是从最后一棵树开始调整的，只要我们找到了this.elem[child] <= this.elem[parent]
//                // 后续就不需要调整了
//                // 后面的都已经是大根堆了。
//                break;
//            }
//
//        }
//    }
//
//    //创建大根堆
//    public void createdBigHeap (int[] array) {
//        for (int i = 0; i < array.length; i++) {
//            this.elem[i] = array[i];
//            this.usedSize++;
//        }
//        for (int i = (usedSize-1-1)/2; i >= 0 ; i--) {
//            adjustDown(i, this.usedSize);
//        }
//    }

    //大根堆
//    public void adjustDown(int parent, int len) {
//        int child = parent * 2 + 1;  //代表左孩子的节点的下标
//        while (child < len) {
//            if (child + 1 < len && this.elem[child + 1] > this.elem[child]) {
//                child = child + 1;
//            }
//            if (this.elem[child] > this.elem[parent]) {
//                int tmp = this.elem[child];
//                this.elem[child] = this.elem[parent];
//                this.elem[parent] = tmp;
//                parent = child;
//                child = parent * 2 + 1;
//            } else {
//                break;
//            }
//        }
//    }
//    public void createdBigHeap(int[] array) {
//        if (array.length < 0) {
//            return;
//        }
//        for (int i = 0; i < array.length; i++) {
//            this.elem[i] = array[i];
//            this.usedSize++;
//        }
//        for (int i = (this.usedSize - 1 - 1) / 2; i >= 0; i--) {
//            adjustDown(i, this.usedSize);
//        }
//    }


    //小根堆
    //创建
    public void createdSmallHeap(int[] array) {

        if (array.length <= 0) return;

        for (int i = 0; i < array.length; i++) {
            this.elem[i] = array[i];
            this.usedSize++;
        }

        for (int i = (this.usedSize-1-1)/2; i >= 0 ; i--) {

            int parent = i;
            int child = parent * 2 + 1;

            while (child < this.usedSize) {
                if (child + 1 < this.usedSize && this.elem[child + 1] < this.elem[child]) {
                    child = child + 1;
                }
                if (this.elem[child] < this.elem[parent]) {
                    int tmp = this.elem[child];
                    this.elem[child] = this.elem[parent];
                    this.elem[parent] = tmp;
                    parent = child;
                    child = parent * 2 + 1;
                } else {
                    break;
                }
            }

        }
    }

    public void show () {
        for (int i = 0; i < this.usedSize; i++) {
            System.out.print(this.elem[i] + " ");
        }
        System.out.println();
    }


   

    //在小根堆的基础上存元素
    public void push (int val) {
        if (isFull()) {//扩容
            //这样的扩容方法是错误的，实现不了扩容
            //this.elem.length = this.elem.length*2;

            //正确的扩容方法
            this.elem = Arrays.copyOf(this.elem,this.elem.length*2);
        }

        this.elem[this.usedSize] = val;
        this.usedSize++;

        int child = this.usedSize-1;
        int parent = (child-1)/2;
        while (parent >= 0) {
            if (this.elem[child] < this.elem[parent] ) {
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

    public boolean isFull () {
        if (this.usedSize == this.elem.length) {
            return true;
        }
        return false;
    }
    
    
    //在小根堆的基础上取出元素（出队列）
    public int poll() {
        if (isEmpty()) {
            throw new RuntimeException("队列为空");
        }
        //第一个元素和最后一个元素进行交换
        int tmp = this.elem[0];
        this.elem[0] = this.elem[this.usedSize-1];
        this.elem[this.usedSize-1] = tmp;
        this.usedSize--;
        int parent = 0;
        int child = parent*2 + 1;
        while (child < this.usedSize) {
            if (child+1 < this.usedSize && this.elem[child+1] < this.elem[child]) {
                child = child + 1;
            }
            if (this.elem[parent] > this.elem[child]) {
                int ret = this.elem[parent];
                this.elem[parent] = this.elem[child];
                this.elem[child] = ret;
                parent = child;
                child = parent*2 + 1;
            } else{
                break;
            }
        }
        return tmp;
    }
    
    public boolean isEmpty() {
        return this.usedSize == 0;
    }

    //返回队首元素，不删除
    public int peek() {
        if (isEmpty()) return -1;
        return this.elem[0];
    }

}







