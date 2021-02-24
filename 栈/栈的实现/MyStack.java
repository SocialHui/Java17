public class MyStack {
    private int[] elem;
    private int top;  //即可以代表下标，也可以代表当前有几个元素

    public MyStack(int elem) {
        this.elem = new int[elem];
    }


    public boolean isFull() {
        return this.top == this.elem.length;
    }

    public void push(int val) {
        if (isFull()) {
            //return;
            throw new RuntimeException("栈为满");
        }
        this.elem[this.top] = val;
        this.top++;
    }

    public int pop() {
        if ((isFull())) {
            return -1;
        }
        this.top--;
        return this.elem[this.top];
    }

    public int peek() {
        if (isEmpty()) {
//            return -1;
            throw new RuntimeException("栈为空");
        }
        return this.elem[this.top-1];
    }

    public boolean isEmpty() {
        if (size() == 0) {
            return true;
        }
        return false;
    }

    public int size() {
        return this.top;
    }

}
