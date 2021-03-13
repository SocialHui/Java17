public class TestDemo {
    public static void main(String[] args) {
        /*Solution solution = new Solution();
        int[] nums = {1,2,3,2,3,4,4,5,6,4,9,7,6};
        for (int x : nums) {
            System.out.print(x +" ");
        }
        System.out.println();
        solution.sort(nums);
        for (int x : nums) {
            System.out.print(x+" ");
        }*/
        int[] nums = {1,2,3,2,3,4,4,5,6,4,9,7,6};
        for (int x : nums) {
            System.out.print(x +" ");
        }
        System.out.println();
        Solution1 solution1 = new Solution1();
        solution1.sort(nums,0,nums.length-1);
        for (int x : nums) {
            System.out.print(x +" ");
        }
    }
}
