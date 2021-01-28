import java.util.ArrayList;
import java.util.List;

public class ShiftGrid {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        for (; k > 0; k--) {
            int num = grid[grid.length - 1][grid[0].length - 1];
            for (int i = 0; i <= grid.length - 1; i++) {
                for (int j = 0; j <= grid[0].length - 1; j++) {
                    int tmp = grid[i][j];
                    grid[i][j] = num;
                    num = tmp;
                }
            }
        }

        //以下代码是为了让二维数组以正确的方式输出
        List<List<Integer>> list = new ArrayList<>();
        for (int[] i : grid) {
            List<Integer> listRow = new ArrayList();
            list.add(listRow);
            for (int x : i) listRow.add(x);
        }
        return list;
    }
}
