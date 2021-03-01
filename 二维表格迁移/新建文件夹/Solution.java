public class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        //新二维数组的定义不能再循环外边
        //int[][] newShiftGrid = new int[grid.length][grid[0].length];
        for (; k > 0; k--) {
            int[][] newShiftGrid = new int[grid.length][grid[0].length];
            for (int i = 0; i < grid.length; i++) {
                for (int j = 0; j < grid[i].length-1; j++) {
                    newShiftGrid[i][j+1] = grid[i][j];
                }
            }
            for(int i = 1; i < grid.length; i++) {
                newShiftGrid[i][0] = grid[i-1][grid[0].length-1];
            }
            newShiftGrid[0][0] = grid[grid.length-1][grid[0].length-1];
            grid = newShiftGrid;
        }
        List<List<Integer>> list = new ArrayList<>();

        //错误的代码

        // for (int i = 0; i < grid.length; i++) {
        //     List<Integer> listRow = new ArrayList<>();
        //     list.add(listRow);
        //     for (int j = 0; j < grid[i].length; j++) {
        //         listRow.add(listRow.add(grid[i][j]));
        //     }
        // }
        for (int[] row : grid) {
            List<Integer> listRow = new ArrayList<>();
            list.add(listRow);
            for (int v : row) listRow.add(v);
        }
        return list;
    }
}
