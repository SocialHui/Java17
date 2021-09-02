import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            int[] nums = new int[n];
            for (int i = 0; i < nums.length; i++) {
                nums[i] = sc.nextInt();
            }

            int maxSize = 0;
            for (int i = 0; i < nums.length; i++) {
                int min = nums[i];
                for (int j = i + 1; j < nums.length; j++) {
                    if (nums[j] < min) {
                        min = nums[j];
                    }
                    int size = (j-i+1) * min;
                    if (size > maxSize) {
                        maxSize = size;
                    }
                }
            }

            System.out.println(maxSize);
        }
    }
}