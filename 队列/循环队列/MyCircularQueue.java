public class MyCircularQueue {
    public int front;
    public int rear;
    public int[] elem;

    public MyCircularQueue(int k){
        this.elem = new int[k+1];
    }

    /**
     * 入队
     * @param value
     * @return
     */
    public boolean enQueue(int value) {
        if (isFull()) {
            return false;
        }
        this.elem[this.rear] = value;
        this.rear = (this.rear+1)%this.elem.length;
        return true;
    }

    /**
     * 出队
     * @return
     */
    public boolean deQueue() {
        if (isEmpty()) {
            return false;
        }
        this.front = (this.front+1)%this.elem.length;
        return true;
    }

    /**
     * 得到队头元素
     * @return
     */
    public int Rront() {
        if (isEmpty()) {
            return -1;
        }
        return this.elem[this.front];
    }

    /**
     * 得到队尾元素
     * @return
     */
    public int Rear() {
        if (isEmpty()) {
            return -1;
        }
        int index = this.rear;
        if (index == 0) {
            index = this.elem.length-1;
        } else {
            index = this.rear-1;
        }
        return this.elem[index];
    }

    /**
     * 判断循环队列是否为空
     * @return
     */
    public boolean isEmpty() {
        if (this.front == this.rear) {
            return true;
        }
        return false;
    }

    /**
     * 判断循环队列是否是满的
     * @return
     */
    public boolean isFull() {
        if ((this.rear+1)%this.elem.length == this.front) {
            return true;
        }
        return false;
    }
}
