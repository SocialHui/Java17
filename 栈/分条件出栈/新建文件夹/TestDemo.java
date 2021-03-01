public class TestDemo {
    public static void main(String[] args) {
        CatDogAsylum solution = new CatDogAsylum();
        int[][] ope = new int[][]{{1,1},{1,-1},{2,0},{2,-1}};
        System.out.println(solution.asylum(ope));
    }
}
