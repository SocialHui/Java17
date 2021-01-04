
public class Test {
    public static void main(String[] args) {
        //奇数位于偶数之前
        //调整数组顺序使得奇数位于偶数之前。调整之后，不关心大小顺序。
        int[] arr = {1,2,3,4,5,6};
        int[] arr2= new int[arr.length];
        int left = 0;
        int right = arr.length - 1;

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        for (int i = 0; i <arr.length; i++) {
            if (arr[i]%2 == 0) {
                arr2[right] = arr[i];
                right--;
            } else {
                arr2[left] = arr[i];
                left++;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr2[i]+" ");
        }
    }
}
