public class TestDemo {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String paragraph = "a a, a, a, b,b,b,c,c";
        String[] banned = {"a"};
        System.out.println(solution.mostCommonWord(paragraph, banned));
    }
}
