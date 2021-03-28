public class TestDemo {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] num = {1,2,3};
        int[] n = solution.plusOne(num);
        for (int i = 0; i < num.length; i++) {
            System.out.println(n[i]);
        }
    }
}
