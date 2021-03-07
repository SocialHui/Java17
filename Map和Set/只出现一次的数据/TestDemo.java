import java.util.HashSet;
import java.util.Set;

public class TestDemo {

    public static void main(String[] args) {
        int[] array = {1,1,2,2,3,4,4,5,5};
        System.out.println(singleNumber(array));
    }

    public static int singleNumber(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i])) {
                set.remove(nums[i]);
            } else {
                set.add(nums[i]);
            }
        }
        for (int x : set) {
            return x;
        }
        return -1;
    }

}
