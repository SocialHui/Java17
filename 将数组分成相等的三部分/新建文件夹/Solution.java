public class Solution {
    public boolean canThreePartsEqualSum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        if (sum % 3 != 0) {
            return false;
        }
        int num = sum/3;
        int num1 = 0;
        int i = 0;
        for (; i < arr.length; i++) {
            num1 += arr[i];
            if (num1 == num) {
                break;
            }
        }
        int num2 = 0;
        int j = i+1;
        for (; j < arr.length; j++) {
            num2 += arr[j];
            if (num2 == num) {
                break;
            }
        }
        if (i == arr.length || j == arr.length || j == arr.length-1) {
            return false;
        }
        // int j  = arr.length-1;
        // for (; j > 0; j--) {
        //     num2 += arr[j];
        //     if (num2 == num) {
        //         break;
        //     }
        // }
        // if (i >= j || i+1 == j) {
        //     return false;
        // }
        return true;
    }
}
