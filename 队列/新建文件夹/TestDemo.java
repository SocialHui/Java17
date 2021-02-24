import queuedemo.MyQueue;

public class TestDemo {
    public static void main(String[] args) {
        MyQueue myQueue = new MyQueue();
        myQueue.offer(1);
        myQueue.offer(2);
        System.out.println(myQueue.peek());
        System.out.println(myQueue.poll());
    }
}
