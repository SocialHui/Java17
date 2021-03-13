public class TestDemo {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {1,2,3,2,3,4};
        for (int x : nums) {
            System.out.print(x +" ");
        }
        System.out.println();
        solution.sort(nums);
        for (int x : nums) {
            System.out.print(x+" ");
        }
    }
}
