import java.util.*;

public class Bonus {
    public int getMost(int[][] board) {
        // write code here
        for (int i = 0; i < board[0].length-1; i++) {
            board[0][i+1] += board[0][i];
        }
        for (int i = 0; i < board.length-1; i++) {
            board[i+1][0] += board[i][0];
        }
        for (int i = 1; i < board.length; i++) {
            for (int j = 1; j < board[0].length; j++) {
                board[i][j] += Math.max(board[i-1][j],board[i][j-1]);
            }
        }
        return board[board.length-1][board[0].length-1];
    }
}