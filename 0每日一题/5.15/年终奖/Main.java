import java.util.*;

public class Bonus {
    public int getMost(int[][] board) {
        // write code here
        int cow = board.length;  //行数
        int col = board[0].length;   //列数
        //如果是第一行，只能是前面的数值相加得到的结果
        for (int i = 1; i < col; i++) {
            board[0][i] += board[0][i-1];
        }
        for (int i = 1; i < cow; i++) {
            board[i][0] += board[i-1][0];
        }
        for (int i = 1; i < cow; i++) {
            for (int j = 1; j < col; j++) {
                board[i][j] += Math.max(board[i-1][j],board[i][j-1]);
            }
        }
        return board[cow-1][col-1];
    }
}