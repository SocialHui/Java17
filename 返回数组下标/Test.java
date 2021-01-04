public class Test {
    public static void main(String[] args) {
        //给定一个整数数组nums和一个目标值target，在该数组中找出和为目标值的两个整数，并返回他们的下标
        int[] nums = {1,2,3,7,11,15};
        int target = 9;
        //nt[] sub1 = new int[] {};
        int[] arr = sub(nums, target);
        System.out.println(arr[0] + " " + arr[1]);
    }

    public static int[] sub(int[] nums, int target) {
        for (int i = 0; i < nums.length ; i++) {
            for (int j = i+1; j < nums.length ; j++) {
                if (nums[i] + nums[j] == 9) {
                    int[] arr = {i,j};
                    return arr;
                }
            }
        }
        return null;
    }

}
