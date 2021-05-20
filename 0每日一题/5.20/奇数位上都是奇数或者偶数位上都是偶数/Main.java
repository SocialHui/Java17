public class Solution {
    /**
     *	奇数位上都是奇数或者偶数位上都是偶数
     *	输入：数组arr，长度大于2
     *	将arr调整成奇数位上都是奇数或者偶数位上都是偶数
     */
    public void oddInOddEvenInEven(int[] arr) {
        int i = 0;
        int j = 1;
        while (i < arr.length && j < arr.length) {
            if (arr[i]%2 != 0 && arr[j]%2 == 0) {
                int tmp = arr[i];
                arr[i] = arr[j];
                arr[j] = tmp;
                i+=2;
                j+=2;
            } else if (arr[i]%2 == 0 && arr[j]%2 == 0) {
                i+=2;
            } else if(arr[i]%2 != 0 && arr[j]%2 != 0) {
                j+=2;
            } else {
                //这种情况就是正确的不需要兑换位置的
                i+=2;
                j+=2;
            }
        }
        for (int k = 0; k < arr.length; k++) {
            System.out.print(arr[k]+" ");
        }
    }
}