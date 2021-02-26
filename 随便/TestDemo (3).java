public class TestDemo {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[][] gid = new int[3][3];
        for (int i = 0; i < gid.length; i++) {
            for (int j = 0; j < gid[i].length; j++) {
                gid[i][j] = i+j;
            }
        }
        System.out.println(solution.shiftGrid(gid, 3));
    }
}
