import java.util.*;

public class Robot {
    public int countWays(int x, int y) {
        // write code here
        int num = getNum(x,y);
        return num;
    }
    
    public int getNum(int x,int y) {
        if (x <= 1 || y <= 1) {
            return 1;
        }
        return getNum(x,y-1)+getNum(x-1,y);
    }
}


