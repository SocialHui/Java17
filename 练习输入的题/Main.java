import java.util.*;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String str = sc.nextLine();
            str = str.replace("[","");
            str = str.replace("]","");
            String[] strs = str.split(",");
            int[] nums = new int[strs.length];
            for (int i = 0; i < nums.length; i++) {
                nums[i] = Integer.parseInt(strs[i]);
            }
            int num = nums[nums.length-1];
            int target = -1;
            for (int i = 0; i < nums.length-1; i++) {
                if (i == 0 && num < nums[i]) {
                    target = 0;
                    break;
                }
                if (nums[i] == num) {
                    target = i;
                    break;
                } else if (i < nums.length-1 && num > nums[i] && num < nums[i+1]) {
                    target = i+1;
                    break;
                }
            }
            if (target >= 0) {
                System.out.println(target);
            } else {
                System.out.println(nums.length);
            }
        }
    }
}