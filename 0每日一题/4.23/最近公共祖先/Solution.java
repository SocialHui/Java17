import java.util.*;

public class Solution {
    public int getLCA(int a, int b) {
        // write code here
        return getZu(a, b);
    }


    public int getZu(int a, int b) {
        if (a == b) {
            return b;
        }
        int fu = 1;
        if (a > b) {
            fu = getZu(a / 2, b);
        }
        if (a < b) {
            fu = getZu(a, b / 2);
        }
        return fu;
    }
}