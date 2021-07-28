import java.util.*;


public class Solution {
    /**
     * 
     * @param A int整型一维数组 
     * @return int整型
     */

public static int singleNumber(int[] A) {
    int num = 0;
    for(int i=0;i<A.length;i++){
        num^=A[i];
    }
    return num;
}
}