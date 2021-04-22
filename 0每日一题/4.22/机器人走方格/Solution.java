public class Solution {
    public int countWays(int x, int y) {
        // write code here
        return count(x,y);
    }
    public int count(int x, int y) {
        if (x == 1 || y == 1) {
            return 1;
        }
        return count(x-1,y)+count(x,y-1);
    }
}


