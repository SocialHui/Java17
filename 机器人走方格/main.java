import java.util.*;

public class Robot {
    public int countWays(int x, int y) {
        // write code here
        if (x == 0 && y == 0) {
            return 0;
        }
        if (x <= 1 || y <= 1) {
            return 1;
        }
        int num = countWays(x-1,y)+countWays(x,y-1);
        return num;
    }
}