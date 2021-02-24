public class TestDemo {
    public static void main(String[] args) {
        MyStack myStack = new MyStack(10);
        myStack.push(10);
        myStack.push(20);
        myStack.push(30);
        myStack.push(40);
        myStack.push(50);
        System.out.println(myStack.peek());
        System.out.println(myStack.pop());
        System.out.println(myStack.isEmpty());
        System.out.println(myStack.pop());
        System.out.println(myStack.pop());
    }
}
