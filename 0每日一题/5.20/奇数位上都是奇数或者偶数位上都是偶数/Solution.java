public class Solution {
    /**
     *	奇数位上都是奇数或者偶数位上都是偶数
     *	输入：数组arr，长度大于2
     *	将arr调整成奇数位上都是奇数或者偶数位上都是偶数
     */
    public void oddInOddEvenInEven(int[] arr) {
        //先来计算奇数和偶数的个数哪个多
        int ji = 0;
        int ou = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]%2 == 0) {
                ou++;
            } else {
                ji++;
            }
        }
        //如果时偶数多，就只能保证每个偶数位上面都是偶数，不能保证奇数位上面都是奇数，   相反也是相同的
        int i = 0;  //代表偶数位
        int j = 1;  //代表奇数位
        if (ou>ji) {
            while (i < arr.length && j < arr.length) {
                if (arr[i] % 2 == 0) {
                    i += 2;
                } else {
                    if (arr[j]%2 == 0) {
                        int tmp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = tmp;
                        i+=2;
                        j+=2;
                    } else {
                        j+=2;
                    }
                }
            }
        } else {
            //奇数的个数大于偶数的个数
            while (i < arr.length && j < arr.length) {
                if (arr[j]%2 != 0) {
                    j+=2;
                } else {
                    if (arr[i]%2 != 0) {
                        int tmp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = tmp;
                        i+=2;
                        j+=2;
                    } else {
                        i+=2;
                    }
                }
            }
        }
       /* for (int k = 0; k < arr.length; k++) {
            System.out.print(arr[k]+" ");
        }*/
    }
}