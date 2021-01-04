public class Test {
    public static void main(String[] args) {
        //创建的数组，并且赋初始值
        //创建一个 int 类型的数组, 元素个数为 100, 并把每个元素依次设置为 1 - 100
        int[] arr = new int[100];
        for (int i = 0; i<arr.length; i++) {
            arr[i] = i+1;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

}
