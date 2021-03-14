public class TestDemo {
    public static void main(String[] args) {
        MyQueue myQueue = new MyQueue();
        myQueue.push(10);
        myQueue.push(20);
        myQueue.push(2);
        myQueue.show();
        System.out.println(myQueue.get());
        myQueue.remove();
        myQueue.show();
        System.out.println(myQueue.isEmpty());
    }
}
