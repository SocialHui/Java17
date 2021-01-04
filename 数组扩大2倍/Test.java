public class Test {
    public static void main(String[] args) {
        //改变原有数组元素的值
        //实现一个方法 transform, 以数组为参数, 循环将数组中的每个元素 乘以 2 , 并设置到对应的数组元素上.
        // 例如 原数组为 {1, 2, 3}, 修改之后为 {2, 4, 6}
        int[] arr = {1,2,3,4,5,6};
        print(arr);
        System.out.println();
        transform(arr);
        print(arr);
    }

    public static void print(int[] arr) {
        for (int i = 0; i<arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }

    public static void transform(int[] arr) {
        for (int i = 0; i < arr.length ; i++) {
            arr[i] = arr[i]*2;
        }
    }

}
