public class TestDemo {
    public static void main(String[] args) {
        int[] array = {4,4,3,2,6,5,7};
        for (int x : array) {
            System.out.print(x+" ");
        }
        System.out.println();
        Solution solution = new Solution();
        solution.sort(array);
        for (int x : array) {
            System.out.print(x+" ");
        }
        System.out.println();
    }
}
