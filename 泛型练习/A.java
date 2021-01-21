public class A<T> {
    T value;

    A(T value) {
        this.value = value;
    }

    T get() {
        return value;
    }

    public static void main(String[] args) {
        A<Integer> i = new A<>(10);
        System.out.println(i.get());

        A<Double> m = new A<>(12.3);
        System.out.println(m.get());

        A<String> str = new A<>("bit");
        System.out.println(str.get());
    }

}
