
public class TestDemo {
    public static void main(String[] args) {
        MyStack myStack = new MyStack();
        myStack.push(10);
        myStack.push(20);
        myStack.push(5);
        myStack.show();
        System.out.println(myStack.get());
    }
}
