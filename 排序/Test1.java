public class Test {
    public static void main(String[] args) {
        //给定一个整型数组, 判定数组是否有序（递增）
        int[] arr = {1,3,5,2,9,8,6};
        boolean tmp = judge(arr);
        if (tmp == true) {
            System.out.println("数组有序");
        } else {
            System.out.println("数组无序");
        }
    }

    public static boolean judge(int[] arr) {
        for (int i = 0; i < arr.length-1 ; i++) {
            if (arr[i] > arr[i+1]) {
                return false;
            }
        }
        return  true;
    }
}
